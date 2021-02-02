package com.kodilla.abstracts.homework;

public class Person extends Job{


    private static Object TaxiDriver;
    private String firstName;
    private int age;
    private  Job job;

    public Person(String jarek, int i, TaxiDriver taxiDriver) {


    }

    public Person() {

    }


    public void showPersonResponsibilities() {
        System.out.println("Jestem TaxiDriver zawoze ludzi" + job);
        System.out.println("Jestem Builder buduje domy" + job);

    }

    public static void main(String[] args) {
        Person jarek = new Person();
        jarek.firstName = " Jarek";
        jarek.age = 30;

        Person marek = new Person();
        marek.firstName = "Marek";
        marek.age = 35;





        jarek.showPersonResponsibilities();
        marek.showPersonResponsibilities();



    }

}
