package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.regex.Pattern;

public class ValidateEmailJson {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = mapper.readTree(new File("src/ioprogramming/jsondata/student_record.json"));

        String email = node.get("email").asText();

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if(Pattern.matches(regex,email)){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}