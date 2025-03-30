package com.example.java3activity51.business;

import com.example.java3activity51.model.OrderModel;

import java.util.List;

public interface OrdersBusinessInterface {
    public void test();

    public List<OrderModel> getOrders();
    public OrderModel getOrderById(String id);

    public void init();

    public void destroy();
}
