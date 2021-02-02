package com.kodilla.basic_assertion;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

    }
}
