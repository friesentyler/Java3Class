package com.example.java3activity41.respository;

import com.example.java3activity41.entity.OrderEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {
    @Override
    @Query(value = "SELECT * FROM ORDERS")
    public List<OrderEntity> findAll();
}
