package com.example.java3activity51.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="orders")
public class OrderList {
    private List<OrderModel> orders = new ArrayList<OrderModel>();

    @XmlElement(name="order")
    public List<OrderModel> getOrders() {
        return this.orders;
    }

    public void setOrders(List<OrderModel> orders) {
        this.orders = orders;
    }
}
