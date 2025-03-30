package com.example.java3activity51.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class UserEntity {
    @Id
    String id;
    @Indexed(unique=true)
    String username;
    String password;
}
