package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.LinkedList;
import java.util.List;

public class GenelarCarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Ford ford = new Ford(10.0);
        cars.add(ford);
        cars.add(new Opel(4));
        cars.add(new Seat());

        cars.remove(2);

        System.out.println(cars.size());
        for(Car car : cars) {
            System.out.println(car + ", describeCar: " + car.describeCar());
        }

        cars.remove(ford);
        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + ", describeCar: " + car.describeCar());
        }

    }
}
