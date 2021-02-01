package com.kodilla.abstracts.homework;

public class Person extends Job{

    private String firstName;
    private int age;
    private  Job job;

    public Person(String jarek, int age, TaxiDriver taxiDriver) {

    }


    public void showPersonResponsibilities() {
        System.out.println(firstName + "has to ");
        job.showResponsibilities();
        System.out.println("to earn for living");
    }

    public static void main(String[] args) {
        Person jarek = new Person("jarek", 50, new TaxiDriver());

        jarek.showPersonResponsibilities();



    }

}
