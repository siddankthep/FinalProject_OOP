package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

public abstract class User {
    private String phoneNumber;

    private String password;

    public User(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
//        this.password = generatePassword();
    }

//    private String generatePassword() {
//        return UUID.randomUUID().toString().substring(0, 8);
//    }

    // Rest of the code...

    // Getters and setters for phoneNumber and password
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
