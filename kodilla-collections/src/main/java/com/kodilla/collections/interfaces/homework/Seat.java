package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {

    private int speed;
    private double increase;
    private double decrease;

    public Seat(int speed,double increase, double decrease) {

        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed + increase;
    }

    @Override
    public double decreaseSpeed() {
        return speed - decrease;
    }
}
