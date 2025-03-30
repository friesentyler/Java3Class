package com.example.java3activity51.business;

import com.example.java3activity51.data.OrderDataService;
import com.example.java3activity51.entity.OrderEntity;
import com.example.java3activity51.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public OrderModel getOrderById(String id) {
        OrderEntity orderEntity = service.findById(id);
        if (orderEntity != null) {
            return new OrderModel(orderEntity.getId(), orderEntity.getOrderNo(), orderEntity.getProductName(), orderEntity.getPrice(), orderEntity.getQuantity());
        } else {
            return null;
        }
    }

    public void init() {
        System.out.println("init ordersbusinessservice");
    }
    public void destroy() {
        System.out.println("destroy ordersbusinessservice");
    }
}
