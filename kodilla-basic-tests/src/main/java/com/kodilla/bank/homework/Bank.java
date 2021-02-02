package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] values;
    private int size;

    public void add(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public double getSaldo() {
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            CashMachine cM = this.values[i];
            double saldo = cM.getSaldo();
            sum += saldo;

        }
        return sum;
    }

    public double getAverage() {
        return -1;
    }
}
