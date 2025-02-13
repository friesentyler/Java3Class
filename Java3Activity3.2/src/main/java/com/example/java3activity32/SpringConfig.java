package com.example.java3activity32;

import com.example.java3activity32.business.OrdersBusinessInterface;
import com.example.java3activity32.business.OrdersBusinessService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {

    @Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
    public OrdersBusinessInterface getOrdersBusiness() {
        return new OrdersBusinessService();
    }
}
