package hw3.task1;

import java.io.*;

public class StudentSerialization {
    public static void serializeObject(Student student, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(student);
            System.out.println("Serialization successful\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserializeStudent(String fileName) {
        Student student = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            student = (Student) ois.readObject();
            System.out.println("Deserialization successful\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return student;
    }
}
