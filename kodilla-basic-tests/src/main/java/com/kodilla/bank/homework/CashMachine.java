package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;


    public CashMachine(int i) {

        this.values = new int[0];
        this.size = 0;
    }

    public CashMachine() {

    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {

        return values;
    }
    public double getSaldo() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }
    public int getTransaction() {

        return size;
    }
    public int getWyplaty() {
        int counter = 0;
        for(int i = 0; i< this.values.length; i++) {
            if (this.values[i] < 0) {
                counter ++;

            }
        }
        return counter;
    }
    public int getWplaty() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                counter++;

            }
        }
        return counter;
    }
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }

    public int[] getTransactions() {
        return new int[0];
    }

}
