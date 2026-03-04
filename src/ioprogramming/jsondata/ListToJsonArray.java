package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class User {
    public String name;
    public int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {

    public static void main(String[] args) throws Exception {

        List<User> users = Arrays.asList(
                new User("Karthik",22),
                new User("Rahul",30)
        );

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

        System.out.println(json);
    }
}