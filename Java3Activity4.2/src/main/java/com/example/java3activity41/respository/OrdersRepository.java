package com.example.java3activity41.respository;

import com.example.java3activity41.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {
}
