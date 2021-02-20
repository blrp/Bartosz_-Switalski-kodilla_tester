package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("01/2021"));
        warehouse.addOrder(new Order("02/2021"));
        warehouse.addOrder(new Order("03/2021"));
        warehouse.addOrder(new Order("04/2021"));
        warehouse.addOrder(new Order("05/2021"));
        warehouse.addOrder(new Order("06/2021"));
        warehouse.addOrder(new Order("07/2021"));
        warehouse.addOrder(new Order("08/2021"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a order number (nn/yyyy):");
        String orderNumber = scanner.nextLine();

        try {
            Order isOrderNumberInList = warehouse.getOrder(orderNumber);
            System.out.println("Order number: " + orderNumber + " is on the list.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order number: " + orderNumber + " is NOT on the list.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

