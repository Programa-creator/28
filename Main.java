package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setEmail("johndoe@example.com");
        studentDAO.save(student1);

        List<Student> students = studentDAO.getAll();
        System.out.println("All students:");
        for (Student student : students) {
            System.out.println(student);
        }

        Student student2 = studentDAO.getById(1);
        System.out.println("Student with ID 1: " + student2);

        student2.setName("Jane Smith");
        studentDAO.update(student2);
        studentDAO.delete(student1);

        students = studentDAO.getAll();
        System.out.println("All students after changes:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

