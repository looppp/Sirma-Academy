package com.academi.sirma.restdbapp.models;

import jakarta.validation.constraints.*;

public class User {
    private int id;

    @NotEmpty(message = "Username cannot be empty.")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters.")
    private String username;

    @NotEmpty(message = "Password cannot be empty.")
    @Size(min = 6, max = 12, message = "Password length has to be between 6-12 characters.")
    private String password;

    @NotEmpty(message = "Email cannot be empty.")
    @Email(message = "Email isn't valid.")
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
