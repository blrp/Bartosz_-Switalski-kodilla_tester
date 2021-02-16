package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {

    private String studentName;
    private Teacher teacher;

    public Student(String studentName, Teacher teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTeacher() {
        return String.valueOf(teacher);
    }
}
