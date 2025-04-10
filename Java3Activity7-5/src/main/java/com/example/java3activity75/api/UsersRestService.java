package com.example.java3activity75.api;

import com.example.java3activity75.business.UserBusinessService;
import com.example.java3activity75.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class UsersRestService {
    @Autowired
    UserBusinessService service;

    @GetMapping(path="/users")
    public ResponseEntity<?> getUsers() {
        try {
            List<UserModel> users = service.getAllUsers();
            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(users, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
