package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfPublishment;

    public OperatingSystem(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;

    }

    public void turnOn() {

        System.out.println("The system turns on");
    }

    public void turnoff() {

        System.out.println("The system turns of");
    }

    public int geyearOfPublishment() {

        return yearOfPublishment;
    }

    public void displayYearOfPublishment() {

        System.out.println("year of publishment: " + yearOfPublishment);
    }
}

