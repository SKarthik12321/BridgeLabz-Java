package tomcatservlet;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.Map;

public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(9000), 0);

        server.createContext("/", new RootHandler());
        server.createContext("/headers", new HeaderHandler());
        server.createContext("/query", new QueryHandler());
        server.createContext("/post", new PostHandler());

        server.setExecutor(null);
        server.start();

        System.out.println("Server started at http://localhost:9000");
    }

    // ROOT HANDLER
    static class RootHandler implements HttpHandler {

        public void handle(HttpExchange exchange) throws IOException {

            String response =
                    "<html>" +
                            "<body>" +
                            "<h2>Java Web Server Running</h2>" +
                            "<p>BridgeLabz Servlet Assignment</p>" +
                            "</body>" +
                            "</html>";

            exchange.sendResponseHeaders(200, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    // HEADER HANDLER
    static class HeaderHandler implements HttpHandler {

        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder response = new StringBuilder();
            response.append("Request Headers:\n");

            for (Map.Entry<String, java.util.List<String>> entry :
                    exchange.getRequestHeaders().entrySet()) {

                response.append(entry.getKey())
                        .append(" : ")
                        .append(entry.getValue())
                        .append("\n");
            }

            exchange.sendResponseHeaders(200, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.toString().getBytes());
            os.close();
        }
    }

    // QUERY HANDLER (GET)
    static class QueryHandler implements HttpHandler {

        public void handle(HttpExchange exchange) throws IOException {

            String query = exchange.getRequestURI().getQuery();

            String response = "Query Parameters: " + query;

            exchange.sendResponseHeaders(200, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    // POST HANDLER
    static class PostHandler implements HttpHandler {

        public void handle(HttpExchange exchange) throws IOException {

            InputStream input = exchange.getRequestBody();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(input));

            StringBuilder body = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                body.append(line);
            }

            String response = "POST Data: " + body;

            exchange.sendResponseHeaders(200, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}