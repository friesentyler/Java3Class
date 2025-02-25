package com.example.java3activity41.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ORDERS")
public class OrderEntity {
    @Id
    Long id;

    @Column("ORDER_NO")
    String orderNo;

    @Column("PRODUCT_NAME")
    String productName;

    @Column("PRICE")
    float price;

    @Column("QUANTITY")
    int quantity;

    public OrderEntity(Long id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
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
