package com.example.java3activity41.data;

import com.example.java3activity41.entity.OrderEntity;
import com.example.java3activity41.respository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDataService {
    @Autowired
    OrdersRepository ordersRepository;

    public OrderDataService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public Object findById() {
        return null;
    }

    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<OrderEntity>();
        try {
            Iterable<OrderEntity> orderIterable = ordersRepository.findAll();
            orders = new ArrayList<OrderEntity>();
            orderIterable.forEach(orders::add);
            return orders;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orders;
    }

    public boolean create(OrderEntity order) {
        try {
            ordersRepository.save(order);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update() {
        return true;
    }

    public boolean delete() {
        return true;
    }
}
