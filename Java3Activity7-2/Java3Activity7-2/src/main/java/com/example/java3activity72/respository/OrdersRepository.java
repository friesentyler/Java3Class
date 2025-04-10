package com.example.java3activity72.respository;

import com.example.java3activity72.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
    OrderEntity getOrderById(String id);
}
