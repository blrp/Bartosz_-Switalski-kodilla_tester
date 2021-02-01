package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {
    public void turnOn() {
        System.out.println("Turn on...");
    }

    public void turnOff() {
        System.out.println("Turn off...");
    }


    public Windows98(int yearOfPublishment) {
        super(yearOfPublishment);
    }
}