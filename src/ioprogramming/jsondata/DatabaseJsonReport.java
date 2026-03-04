package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Employee{
    public int id;
    public String name;
    public int salary;

    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}

public class DatabaseJsonReport {

    public static void main(String[] args) throws Exception {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Karthik",50000),
                new Employee(2,"Rahul",60000),
                new Employee(3,"Anil",55000)
        );

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(employees);

        System.out.println(json);
    }
}