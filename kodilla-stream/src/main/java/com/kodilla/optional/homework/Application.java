package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna"));
        students.add(new Student("Dawid", new Teacher("Witold")));
        students.add(new Student("Tomasz"));
        students.add(new Student("Justyna", new Teacher("Marcin")));

        for (Student student : students) {
            System.out.println("Student: " + student.getStudentName() + ", Teacher: " + student.getTeacher());
        }
    }
}
