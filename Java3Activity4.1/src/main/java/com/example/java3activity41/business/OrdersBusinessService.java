package com.example.java3activity41.business;

import com.example.java3activity41.DataAccessInterface;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.java3activity41.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersBusinessService implements OrdersBusinessInterface {
    @Autowired
    DataAccessInterface<OrderModel> service;
    @Override
    public void test() {
        System.out.println("Hello");
    }

    public List<OrderModel> getOrders() {
        return service.findAll();
    }



    public void init() {
        System.out.println("init ordersbusinessservice");
    }
    public void destroy() {
        System.out.println("destroy ordersbusinessservice");
    }
}
