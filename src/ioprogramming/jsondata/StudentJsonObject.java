package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentJsonObject {
    public static void main(String[] args) throws Exception {

        Map<String, Object> student = new HashMap<>();
        student.put("name", "Karthik");
        student.put("age", 22);
        student.put("subjects", Arrays.asList("Math", "Physics", "CS"));

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

        System.out.println(json);
    }
}