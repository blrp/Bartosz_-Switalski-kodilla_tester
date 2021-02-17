package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna"));
        students.add(new Student("Dawid", new Teacher("Witold")));
        students.add(new Student("Tomasz"));
        students.add(new Student("Justyna", new Teacher("Marcin")));

        for (Student student : students) {
            Optional<String> optionalTeacher = Optional.ofNullable(student.getTeacher()).map(teacher->teacher.getName());
            String teacher = optionalTeacher.orElse("undefined");
            System.out.println("Student: " + student.getStudentName() + ", Teacher: " + teacher);
        }
    }
}
