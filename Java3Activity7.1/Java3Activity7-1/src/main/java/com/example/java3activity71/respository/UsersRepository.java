package com.example.java3activity71.respository;

import com.example.java3activity71.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByUsername(String username);
}
