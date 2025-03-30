package com.example.java3activity51.respository;

import com.example.java3activity51.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends MongoRepository<OrderEntity, String> {
    OrderEntity getOrderById(String id);
}
