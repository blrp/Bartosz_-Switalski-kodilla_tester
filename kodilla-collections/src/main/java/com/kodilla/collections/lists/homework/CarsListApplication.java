package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.kodilla.collections.arrays.homework.CarUtils;


public class CarsListApplication {

    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford(10.0));
        cars.add(new Ford(5.0));
        cars.add(new Ford(1.0));

        for(Ford ford : cars) {
            if(ford.describeCar() > 3)
                System.out.println(ford + ", describeCar: " + ford.describeCar());

        }




    }
}
