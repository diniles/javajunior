package hw3.task2;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class StudentSerialization {
//    public static void serializeToJson(Student student, String fileName) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.writeValue(new File(fileName), student);
//            System.out.println("JSON Serialization successful.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Student deserializeFromJson(String fileName) {
//        Student student = null;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            student = objectMapper.readValue(new File(fileName), Student.class);
//            System.out.println("JSON Deserialization successful.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return student;
//    }

    public static void serializeToXml(Student student, String fileName) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File(fileName), student);
            System.out.println("Serialized to XML file: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromXml(String fileName) {
        Student deserializedStudent = null;
        XmlMapper xmlMapper = new XmlMapper();
        try {
            deserializedStudent = xmlMapper.readValue(new File(fileName), Student.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deserializedStudent;
    }

}
