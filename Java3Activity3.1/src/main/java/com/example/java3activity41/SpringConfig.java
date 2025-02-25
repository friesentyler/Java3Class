package com.example.java3activity41;

import com.example.java3activity41.business.OrdersBusinessInterface;
import com.example.java3activity41.business.OrdersBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name="ordersBusinessService")
    public OrdersBusinessInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
