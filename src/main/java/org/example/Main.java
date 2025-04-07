package org.example;

public class Main {
    public static void main(String[] args) {
        //Add products
        //(int id, String name, double price, String description
        Product product1 = new Product(1, "Lux", 3.20, "Soap", "Skin care");
        Product product2 = new Product(2, "Pantene", 8.70, "Shampoo", "Hair care");
        Product product3 = new Product(3, "The Ordinary Squalane Cleanser ", 12.00, "Cleanser","Skin care");
        ProductRepo productRepo = new ProductRepo();
        productRepo.addPredefinedProduct(product1); //passing object of Producty in ProductRepo.
        productRepo.addPredefinedProduct(product2);
        productRepo.addPredefinedProduct(product3);

        //Display
        productRepo.displayProducts();

        //add two new product
        Product product4 = new Product(4, "Laneige Water Sleeping Mask ", 25, "Mask", "Skin care");
        Product product5 = new Product(5, "Aveeno Daily Moisturizing Lotion  ", 7.5, "Lotion", "Body care");
        productRepo.addNewProduct(product4);
        productRepo.addNewProduct(product5); //Sending to add product

        //Display All products after adding new:
          productRepo.displayProducts();

        //remove Product
        productRepo.removeProduct(product2); //removing product2
        //Fetching final List
         productRepo.displayProducts();

        //Orders
        //order1 contains product1. sending name and price from product1 object
        Order order1 = new Order(1,"Delivered", 2, 20, "Card", product1.name(), product1.price());
        OrderListRepo orderListRepo = new OrderListRepo();
        orderListRepo.addPredefinedOrder(order1);

        //order2 contains product2 and 4. sending name and price from product1 object
        Order order2a = new Order(2,"Pending", 2, 20, "Card", product2.name(), product2.price());
        Order order2b = new Order(2,"Pending", 2, 20, "Card", product4.name(), product4.price());
        orderListRepo.addPredefinedOrder(order2a);
        orderListRepo.addPredefinedOrder(order2b);

        //Display
        orderListRepo.displayOrders();

        //add new order, add product 3 in it
        Order order3 = new Order(3,"Pending", 3, 30, "Cash on Delivery", product3.name(), product3.price());
        orderListRepo.addNewOrder(order3);
        //display orders after newly added order
        orderListRepo.displayOrders();

        //removing order number 3
        orderListRepo.removeOrder(order3);
        //display list after removal
        orderListRepo.displayOrders();
       // Commented because I want to pass orderMapREPO
        /* //Passing object of Product Record to ProductRepo Class and storing there in a list. Calling from Main. Its taking from Product
        //ShopService shopService = new ShopService(orderListRepo); //for orderListRepo
        shopService.newOrderPlacment(order1); //exists
        shopService.newOrderPlacment(order3); //not exists
        /Shop Service //order 3should not exists and order1 should exist */
        OrderRepoInterface orderRepo2 = new OrderMapRepo(); // or OrderListRepo if you want
        ShopService shopService = new ShopService(orderRepo2); // passing repo to shopService
        shopService.newOrderPlacment(order1); // exists
        shopService.newOrderPlacment(order3); // does not exist, will not be placed

        orderRepo2.addOrder(order1);
        orderRepo2.addOrder(order3);  // Adds order1 to the repo
        //printing ensure its added.
        System.out.println("Orders after adding order1:");
        for (Order order : orderRepo2.getAll()) {
            System.out.println(order);
        }
    }
}