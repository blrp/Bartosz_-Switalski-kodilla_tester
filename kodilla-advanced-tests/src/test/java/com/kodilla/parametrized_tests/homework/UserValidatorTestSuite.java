package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringManipulator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings= {"^[Bartek nn=+31.m,s]{3,}$"})
    public void shouldReturnTrueForUserValiadator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"'[bra1-_'f3/?s]{4.}€"})
    public void shouldReturnFalseForUserValiadator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"^([_f-cA-Z1-5-]+(\\.[_q-mA-Z3-4-]+)*@[j-jA-Zk-1-]+(\\.[v-sA-Z4-3-]+)*(\\.[d-sA-G]{1,6}))?$"})
    public void shouldReturnTrueForValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"^([_h-bA-Z5-2-]+(\\.[_t-rA-Z5-4-]+)*@[j-yA-Z7-7-]+(\\.[x-xA-Z7-6-]+)*(\\.[j-kA-L]{1,6}))?$"})
    public void shouldReturnFalseForValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }



}