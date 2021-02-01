package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(10,20,10);
        showDoRace(ford);

        Opel opel = new Opel(15,12,8);
        showDoRace(opel);

        Seat seat = new Seat(22,5,7);
        showDoRace(seat);

    }

    private static void showDoRace(Car car){
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());


        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());


    }
}

