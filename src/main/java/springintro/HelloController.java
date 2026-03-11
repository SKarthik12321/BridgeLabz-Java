package springintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class HelloController {

    // UC1
    // Test in browser: http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    // UC2
    // Test in browser: http://localhost:8080/hello/query?name=Karthik
    @GetMapping("/hello/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3
    // Test in browser: http://localhost:8080/hello/param/Karthik
    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //UC4
    // Test using curl: curl -X POST http://localhost:8080/hello/post -H "Content-Type: text/plain" -d "Karthik"
    @PostMapping("/hello/post")
    public String helloPost(@RequestBody String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC5
    // Test using curl: curl -X PUT "http://localhost:8080/hello/put/Karthik?lastName=R"
    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}