package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface{
private Map<Integer,Order> ordersMap= new HashMap<>();

    @Override
    public void addOrder(Order order) {
        ordersMap.put(order.orderId(), order);
    }

    @Override
    public void removeOrder(Order order) {
        ordersMap.remove(order.orderId());
        System.out.println("Removed Order: " + order);
    }

    @Override
    public Order getSingleOrder(int orderId) {
        return ordersMap.get(orderId);
    }

    @Override
    public ArrayList<Order> getAll() {
        return new ArrayList<>(ordersMap.values()); // Converting Map values to ArrayList
    }
}
