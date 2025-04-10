package com.example.java3activity75.respository;

import com.example.java3activity75.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
}
