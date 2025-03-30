package com.example.java3activity51.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class OrderEntity {
    @Id
    String id;

    @Indexed(unique=true)
    String orderNo;

    @Indexed(unique=true)
    String productName;

    float price;

    int quantity;

    public OrderEntity(String id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return this.id;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getProductName() {
        return this.productName;
    }

    public float getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
