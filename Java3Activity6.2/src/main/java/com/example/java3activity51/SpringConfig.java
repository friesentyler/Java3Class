package com.example.java3activity51;

import com.example.java3activity51.business.OrdersBusinessInterface;
import com.example.java3activity51.business.OrdersBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
    public OrdersBusinessInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
