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
    @ValueSource(strings= {"^[a-zA-Z0-9._-]{3,}$"})
    public void shouldReturnTrueForUserValiadator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"'[b-aA-Z1-2._=]{4.}€"})
    public void shouldReturnFalseForUserValiadator(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"})
    public void shouldReturnTrueForValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$"})
    public void shouldReturnFalseForValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }



}