package org.example;

public record Order(int orderId, String status, int quantity,  double totalAmount, String paymentMethod, String productName, double productPrice) {
}
