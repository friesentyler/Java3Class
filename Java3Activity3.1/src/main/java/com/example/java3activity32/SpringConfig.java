package com.example.java3activity32;

import com.example.java3activity32.business.OrdersBusinessInterface;
import com.example.java3activity32.business.OrdersBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name="ordersBusinessService")
    public OrdersBusinessInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
