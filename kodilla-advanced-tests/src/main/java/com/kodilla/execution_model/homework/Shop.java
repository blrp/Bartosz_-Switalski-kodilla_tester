package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromToDate(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(d -> d.getDate().isAfter(from) && d.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersInValueRange(double lowLimit, double hightLimit) {
        return orders.stream()
                .filter(v -> v.getValue() >= lowLimit && v.getValue() <= hightLimit)
                .collect(Collectors.toList());
    }

    public int getOrdersSize() {
        return orders.size();
    }
    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return new Order("",null, 0);
    }
    public double getOrdersTotalValue() {
        return orders.stream()
                .map(t -> t.getValue())
                .mapToDouble(t -> t)
                .sum();
    }
}
