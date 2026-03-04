package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFiles {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 = (ObjectNode) mapper.readTree(new File("src/ioprogramming/jsondata/dataA.json"));
        ObjectNode obj2 = (ObjectNode) mapper.readTree(new File("src/ioprogramming/jsondata/dataB.json"));

        obj1.setAll(obj2);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1));
    }
}