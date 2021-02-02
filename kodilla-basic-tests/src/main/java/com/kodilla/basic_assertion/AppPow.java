package com.kodilla.basic_assertion;

public class AppPow {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int powResult = calculator.pow(a);
        boolean right = ResultChecker.assertEquals(64, powResult);
        if (right) {
            System.out.println("Metoda pow działa poprawnie dla liczb " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczb " + a);
        }
    }
}

