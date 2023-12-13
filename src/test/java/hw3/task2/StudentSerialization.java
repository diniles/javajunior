package hw3.task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class StudentSerialization {
    public static void serializeToJson(Student student, String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(fileName), student);
            System.out.println("JSON Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromJson(String fileName) {
        Student student = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            student = objectMapper.readValue(new File(fileName), Student.class);
            System.out.println("JSON Deserialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void serializeToXml(Student student, String fileName) {
        try {
            javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(Student.class);
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(student, new File(fileName));
            System.out.println("XML Serialization successful.");
        } catch (javax.xml.bind.JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeFromXml(String fileName) {
        Student student = null;
        try {
            javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(Student.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            student = (Student) jaxbUnmarshaller.unmarshal(new File(fileName));
            System.out.println("XML Deserialization successful.");
        } catch (javax.xml.bind.JAXBException e) {
            e.printStackTrace();
        }
        return student;
    }

}