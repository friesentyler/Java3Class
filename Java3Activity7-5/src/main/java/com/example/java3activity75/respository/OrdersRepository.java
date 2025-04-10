package com.example.java3activity75.respository;

import com.example.java3activity75.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
    OrderEntity getOrderById(String id);
}
