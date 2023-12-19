package hw3.task2;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Markus", 62, 8.7);

        System.out.println("Original class student");
        System.out.println(student);
        System.out.println();

        StudentSerialization.serializeToJson(student, "student.json");
        Student deserializedStudentJson = StudentSerialization.deserializeFromJson("student.json");
        System.out.println("Deserialized from JSON class student");
        System.out.println(deserializedStudentJson);
        System.out.println();

        StudentSerialization.serializeToXml(student, "student.xml");
        Student deserializedStudentXml = StudentSerialization.deserializeFromXml("student.xml");
        System.out.println("Deserialized from XML class student");
        System.out.println(deserializedStudentXml);
        System.out.println();
    }
}
