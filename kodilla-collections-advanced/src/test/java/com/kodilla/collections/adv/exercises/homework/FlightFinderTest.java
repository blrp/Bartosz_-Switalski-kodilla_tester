package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // gives
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("London", "Rome"));
        flightList.add(new Flight("Paris", "Rome"));
        flightList.add(new Flight("London", "Moscow"));
        // when
        List<Flight> result = flightFinder.findFlightsFrom("London");                              // zwracana jest pusta lista, tak jakby metoda ta wywoływana była, nie widząc nowo dodanych elementów
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Rome"));
        expectedList.add(new Flight("London", "Moscow"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        // gives
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("London", "Rome"));
        flightList.add(new Flight("Warsaw", "Frankfurt"));
        flightList.add(new Flight("Warsaw", "London"));
        // when
        List<Flight> result = flightFinder.findFlightsTo("London");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Rome"));
        expectedList.add(new Flight("Warsaw", "London"));
        assertEquals(expectedList, result);
    }
}