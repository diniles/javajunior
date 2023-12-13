package hw3.task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dmitry", 50, 8.2);

        System.out.println("Original class student");
        System.out.println(student);
        System.out.println();

        StudentSerialization.serializeObject(student, "student.ser");

        Student deserializedStudent = StudentSerialization.deserializeStudent("student.ser");
        System.out.println("Deserialized class student");
        System.out.println(deserializedStudent);
        System.out.println("Field 'GPA' not restored because it's 'transient'");
    }
}
