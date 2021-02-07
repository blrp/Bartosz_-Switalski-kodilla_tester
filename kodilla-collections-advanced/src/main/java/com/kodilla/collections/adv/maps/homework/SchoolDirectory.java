package com.kodilla.collections.adv.maps.homework;



import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> school = new HashMap<>();
        Principal jan = new Principal("Jan", "SGH");
        Principal tomasz = new Principal("Tomasz", "WSH");
        Principal bartek = new Principal("Bartek", "PWSZ");


        School janSchool = new School(5000);
        School tomaszSchool = new School(3299);
        School bartekSchool = new School(8255);

        school.put(jan, janSchool);
        school.put(tomasz, tomaszSchool);
        school.put(bartek, bartekSchool);


        for (Map.Entry<Principal, School> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstname() + ", schoolName: " +
                    studentEntry.getValue());



    }
}
