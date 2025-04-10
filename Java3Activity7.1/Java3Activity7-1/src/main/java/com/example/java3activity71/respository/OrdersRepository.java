package com.example.java3activity71.respository;

import com.example.java3activity71.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
    OrderEntity getOrderById(String id);
}
