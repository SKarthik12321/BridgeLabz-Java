package ioprogramming.jsondata;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

public class JsonToXMLConverter {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();

        Object obj = jsonMapper.readValue(
                new File("src/ioprogramming/jsondata/student_record.json"),
                Object.class);

        XmlMapper xmlMapper = new XmlMapper();

        xmlMapper.writerWithDefaultPrettyPrinter().writeValue(
                new File("src/ioprogramming/jsondata/student_record.xml"),
                obj
        );

        System.out.println("XML file created successfully.");
    }
}