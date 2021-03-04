package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();
    Set<Integer> set = new HashSet<>();

    @ParameterizedTest
    @CsvFileSource(resources = "/validatedUserNumbers.csv", numLinesToSkip = 0)
    public void shouldReturnTrueWhenNumbersAreValidated(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        int howmanyWins = gamblingMachine.howManyWins(set);
        assertTrue(howmanyWins >= 0 && howmanyWins<=6);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notValidatedUserNumbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenNumbersAreNotValidated(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @EmptySource
    public void shouldThrowExceptionWhenSetIsNullOrEmpty(Set<Integer> input) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooSmallSet.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenSetIsTooSmall(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tooBigSet.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenSetIsTooBig(String number) throws InvalidNumbersException {
        String[] splitedString = number.split(" ");

        for (String num : splitedString) {
            set.add(Integer.parseInt(num));
        }

        assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
            System.out.println(set);
        });
    }
}