package org.example;

import java.util.ArrayList;

public class OrderListRepo {
    ArrayList<Order> orderslist = new ArrayList<>(); //globally defined for class for generic increment adn deduction
    public void addPredefinedOrder(Order order) {
        System.out.println("Predefined orders: ");
        orderslist.add(order);
    }
    public void displayOrders() {
        System.out.println("Orders: "+orderslist);
        System.out.println("Current Order Count= "+ orderslist.size());
    }
    public void addNewOrder(Order order) {
        System.out.println("Adding orders: ");
        orderslist.add(order);
        System.out.println("Added: : "+order);
    }
    public void removeOrder(Order order) {
        System.out.println("Removing order: ");
        orderslist.remove(order);
        System.out.println("Removed Order: " + order);
    }
}
