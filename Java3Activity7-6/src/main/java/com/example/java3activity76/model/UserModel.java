package com.example.java3activity76.model;

public class UserModel {
    private String id;
    private String username;
    private String password;

    public UserModel() {
        this.id = "";
        this.username = "";
        this.password = "";
    }

    public UserModel(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
