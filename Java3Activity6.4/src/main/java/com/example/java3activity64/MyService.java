package com.example.java3activity64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/service")
public class MyService {
   @GetMapping("/")
    public String home() {
       return "Unsecure";
   }

   @GetMapping("/secure")
    public String secure() {
       return "Secure";
   }
}
