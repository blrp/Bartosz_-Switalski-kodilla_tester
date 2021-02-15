package com.kodilla.collections.sets.homework;



import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("River", "small", "stamp"));
        stamps.add(new Stamp("Sea", "small", "stamp"));
        stamps.add(new Stamp("Mountains", "small", "stamp"));
        stamps.add(new Stamp("Mountains", "small", "stamp"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }
}
