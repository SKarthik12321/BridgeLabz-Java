package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {

    public static void main(String[] args) {

        String json = "{\"name\":\"Karthik\",\"age\":22}";

        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(json);

            System.out.println("Valid JSON");

        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}