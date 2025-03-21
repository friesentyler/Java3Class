package com.example.java3activity51.controller;

import com.example.java3activity51.business.OrdersBusinessInterface;
import com.example.java3activity51.business.SecurityBusinessService;
import com.example.java3activity51.model.LoginModel;
import com.example.java3activity51.model.OrderModel;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private OrdersBusinessInterface service;
    @Autowired
    private SecurityBusinessService security;
    @GetMapping("/")
    public String display(Model model) {
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
        System.out.println(String.format("Form with Username of %s and Password of %s", loginModel.getUsername(), loginModel.getPassword()));
        service.test();
        security.authenticate(loginModel.getUsername(), loginModel.getPassword());

        if (bindingResult.hasErrors()) {
            model.addAttribute("title", "Login Form");
            return "login";
        }

        List<OrderModel> orders = service.getOrders();
        model.addAttribute("title", "My Order");
        model.addAttribute("orders", orders);

        return "orders";
    }
}
