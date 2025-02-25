package com.example.java3activity41.data;

import com.example.java3activity41.entity.OrderEntity;
import com.example.java3activity41.respository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDataService {
    @Autowired
    private OrdersRepository ordersRepository;
    @SuppressWarnings("unused")
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public OrderDataService(OrdersRepository ordersRepository, DataSource dataSource) {
        this.ordersRepository = ordersRepository;
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
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
        String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?, ?, ?, ?)";
        try {
            jdbcTemplateObject.update(sql,
                    order.getOrderNo(),
                    order.getProductName(),
                    order.getPrice(),
                    order.getQuantity()
                    );
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
