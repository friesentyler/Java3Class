package com.example.java3activity75.business;

import com.example.java3activity75.entity.UserEntity;
import com.example.java3activity75.model.UserModel;
import com.example.java3activity75.respository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBusinessService {
    @Autowired
    private UsersRepository usersRepository;
    public UserBusinessService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<UserModel> getAllUsers() {
        List<UserEntity> usersEntity = usersRepository.findAll();
        List<UserModel> usersDomain = new ArrayList<UserModel>();
        for (UserEntity user : usersEntity) {
            usersDomain.add(new UserModel(user.getId(), user.getUsername(), user.getPassword()));
        }
        return usersDomain;
    }
}
