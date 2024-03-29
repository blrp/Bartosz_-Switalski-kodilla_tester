package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessage() {
        String expectedText = "Package delivered to: Turek";
        assertTrue(expectedText.equals(shippingCenter.sendPackage("Turek", 10)));
    }

    @Test
    public void shouldReturnFalseMessage() {
        String expectedText = "Package not delivered to: Turek";
        assertTrue(expectedText.equals(shippingCenter.sendPackage("Turek", 32)));
    }
}