package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CSVtoJsonConverter {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(
                new FileReader("src/ioprogramming/jsondata/employee_data.csv"));

        String header = reader.readLine();
        String[] columns = header.split(",");

        List<Map<String,String>> list = new ArrayList<>();

        String line;

        while((line = reader.readLine()) != null){

            String[] values = line.split(",");

            Map<String,String> map = new HashMap<>();

            for(int i=0;i<columns.length;i++){
                map.put(columns[i],values[i]);
            }

            list.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);

        System.out.println(json);
    }
}