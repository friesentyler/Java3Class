package com.example.java3activity77.respository;

import com.example.java3activity77.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
    OrderEntity getOrderById(String id);
}
