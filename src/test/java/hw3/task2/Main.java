package hw3.task2;


import static hw3.task2.StudentSerialization.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Markus", 62, 8.7);

        System.out.println("Original class student");
        System.out.println(student);
        System.out.println();

        serializeToJson(student, "student.json");
        Student deserializedStudentJson = deserializeFromJson("student.json");
        System.out.println("Deserialized from JSON class student");
        System.out.println(deserializedStudentJson);
        System.out.println();

        serializeToXml(student, "student.xml");
        Student deserializedStudentXml = deserializeFromXml("student.xml");
        System.out.println("Deserialized from XML class student");
        System.out.println(deserializedStudentXml);
        System.out.println();
    }
}
