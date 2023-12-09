package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public abstract class User {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    private String phoneNumber;
    private String password;

    public User(int ID, String phoneNumber, String password) {
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

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
