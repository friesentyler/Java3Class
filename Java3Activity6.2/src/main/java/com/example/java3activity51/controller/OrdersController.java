package com.example.java3activity51.controller;

import com.example.java3activity51.business.OrdersBusinessInterface;
import com.example.java3activity51.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersBusinessInterface service;

    @GetMapping("/display")
    public String display(Model model) {
        List<OrderModel> orders = service.getOrders();
        model.addAttribute("title", "My Orders");
        model.addAttribute("orders", orders);
        return "orders";
    }
}
