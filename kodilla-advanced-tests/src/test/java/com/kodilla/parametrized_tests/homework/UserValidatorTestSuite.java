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
    @ValueSource(strings= {"Bartek","Anna2","krystian72","Piotr1_0","ddd/="})
    public void shouldValidateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Bartek1","Anna2?","krystian72","Piotr1_0","ddd.="})
    public void shouldNotValidateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"Sylwia@gmail.com\", \"bartek7@gmail.com\", \"DawiD._-@gmail.com\", \"&art.switaL@gmail.com\", \"BartE.SwItal$@wp.pl"})
    public void shouldValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings= {"Barti@aaa@ggg.com\", \" \", \"&@@€€%%$%+.com\", \"bartosz"})
    public void shouldNotValidateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }



}