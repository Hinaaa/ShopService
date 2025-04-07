package org.example;

import java.util.ArrayList;

public interface OrderRepoInterface {
    void addOrder(Order order);
    void removeOrder(Order order);
    Order getSingleOrder(int orderId);
    ArrayList<Order> getAll();
}
