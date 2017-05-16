package com.apro.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    void takeOrder(Order order) {
        orderList.add(order);
    }

    void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
