package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJsonRecords {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode users = mapper.readTree(new File("src/ioprogramming/jsondata/users.json"));

        for(JsonNode user : users){
            if(user.get("age").asInt() > 25){
                System.out.println(user);
            }
        }
    }
}