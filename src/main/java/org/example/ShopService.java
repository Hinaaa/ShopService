package org.example;

import java.util.ArrayList;

public class ShopService {
    private OrderRepoInterface orderListRepoSS; //declare variable
    public ShopService(OrderRepoInterface orderListRepo) { //get orderList from Main adn set here din constructor
        this.orderListRepoSS= orderListRepo; //setting repo
    }

    public void newOrderPlacment(Order order) {
        if(orderListRepoSS.getAll().contains(order)) {
            System.out.println("Order exists");
        }
        else { System.out.println("Order does not exists");}
    }
}
