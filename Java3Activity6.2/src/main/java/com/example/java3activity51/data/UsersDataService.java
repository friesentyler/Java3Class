package com.example.java3activity51.data;

import com.example.java3activity51.entity.UserEntity;
import com.example.java3activity51.respository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersDataService implements UsersDataAccessInterface, DataAccessInterface <UserEntity> {
    @Autowired
    public UsersRepository usersRepository;

    public UserEntity findByUserName(String username) {
        return usersRepository.findByUsername(username);
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public UserEntity findById(String id) {
        return null;
    }

    @Override
    public boolean create(UserEntity userEntity) {
        return false;
    }

    @Override
    public boolean update(UserEntity userEntity) {
        return false;
    }

    @Override
    public boolean delete(UserEntity userEntity) {
        return false;
    }

    @Override
    public Object findByUsername(String username) {
        return null;
    }
}
