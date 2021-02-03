package com.kodilla.abstracts.homework;

public abstract class Job {
    int salary;

    String responsibilities;

    public void showResponsibilities() {
        System.out.println("My responsibilities are: " + responsibilities);

    }

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}