package com.kodilla.abstracts.homework;

public class Person {


    private String firstName;
    private int age;
    private  Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }



    public void showPersonResponsibilities() {

        System.out.println("Jestem" + job);
        job.showResponsibilities();


    }

    public static void main(String[] args) {
        TaxiDriver taxiDriver = new TaxiDriver();
        Builder builder = new Builder();
        Person person = new Person("jarek",30, builder);

        person.showPersonResponsibilities();











    }

}
