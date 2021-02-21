package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws Exception {
        Warehouse warehouse = new Warehouse();
        warehouse.getOrder("Not existing order");
    }



}