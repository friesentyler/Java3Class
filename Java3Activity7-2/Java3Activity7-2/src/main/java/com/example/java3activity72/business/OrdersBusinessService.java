package com.example.java3activity72.business;

import com.example.java3activity72.entity.OrderEntity;
import com.example.java3activity72.model.OrderModel;
import com.example.java3activity72.respository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersBusinessService {
    @Autowired
    private OrdersRepository ordersRepository;

    public OrdersBusinessService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<OrderModel> getAllOrders() {
        List<OrderEntity> ordersEntity = ordersRepository.findAll();
        List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
        for (OrderEntity entity : ordersEntity) {
            ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
        }
        return ordersDomain;
    }
}
