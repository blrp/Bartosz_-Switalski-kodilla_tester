package com.kodilla.optional.homework;

public class Teacher {
    String name;
    Teacher teacher;

    public Teacher(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher(Object witold) {

    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
