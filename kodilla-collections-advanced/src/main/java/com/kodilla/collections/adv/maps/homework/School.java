package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Double> school = new ArrayList<>();


    public School(double... school) {
        for (double schools : school)
            this.school.add(schools);
    }




}
