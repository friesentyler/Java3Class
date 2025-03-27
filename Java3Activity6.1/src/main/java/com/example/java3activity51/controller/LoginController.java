package com.example.java3activity51.controller;

import com.example.java3activity51.business.OrdersBusinessInterface;
import com.example.java3activity51.business.SecurityBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    private OrdersBusinessInterface service;
    @Autowired
    private SecurityBusinessService security;

    @GetMapping("/login")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        return "login";
    }
}
