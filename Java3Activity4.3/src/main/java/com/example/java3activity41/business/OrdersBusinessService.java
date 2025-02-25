package com.example.java3activity41.business;

import com.example.java3activity41.data.OrderDataService;
import com.example.java3activity41.entity.OrderEntity;
import com.example.java3activity41.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdersBusinessService implements OrdersBusinessInterface {
    @Autowired
    OrderDataService service;
    @Override
    public void test() {
        System.out.println("Hello");
    }

    @Override
    public List<OrderModel> getOrders() {
        List<OrderEntity> ordersEntity = service.findAll();
        List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
        for (OrderEntity entity : ordersEntity) {
            ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
        }
        return ordersDomain;
    }

    public void init() {
        System.out.println("init ordersbusinessservice");
    }
    public void destroy() {
        System.out.println("destroy ordersbusinessservice");
    }
}
