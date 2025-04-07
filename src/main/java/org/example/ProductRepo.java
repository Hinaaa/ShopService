package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> storedProducts = new ArrayList<>(); //storing in List gloabally at Class level
    public ProductRepo() {

    }

    public void addPredefinedProduct(Product product) {
        //add products
        storedProducts.add(product);
    }

    //Display:
    public void displayProducts() {
        System.out.println("Current Product Count= "+ storedProducts.size());
        System.out.println("List of Products: " + storedProducts);
    }
    //Add Product
    public void addNewProduct(Product product) { //Bcz Im adding so I have to take product Object from Product class where its attributes defined. but it will be called from Main
        System.out.println("Adding Product: ");
        storedProducts.add(product); //this product in new input
        System.out.println("Added Product: " + product);
    }
    //Removing Product
    public void removeProduct(Product product) { //Bcz Im adding so I have to take product Object from Product class where its attributes defined. but it will be called from Main
        System.out.println("Removing Product: ");
        storedProducts.remove(product); //this product in  input
        System.out.println("Removed Product: " + product);
    }
}
