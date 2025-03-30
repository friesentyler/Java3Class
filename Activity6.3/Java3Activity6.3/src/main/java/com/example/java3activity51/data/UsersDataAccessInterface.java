package com.example.java3activity51.data;

public interface UsersDataAccessInterface <T> {
    public T findByUsername(String username);
}
