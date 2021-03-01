package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String login;
    private LocalDate date;
    private double value;

    public Order(String login, LocalDate date, double value) {
        this.login = login;
        this.date = date;
        this.value = value;
    }



    public String getLogin() {
        return login;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }

}
