package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonFields {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode user = mapper.readTree(new File("src/ioprogramming/jsondata/user.json"));

        System.out.println("Name: " + user.get("name").asText());
        System.out.println("Email: " + user.get("email").asText());
        System.out.println("Age: " + user.get("age").asInt());
    }
}