package com.example.finalproject_oop.data_class;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
public class Nurse extends User {
    @PrimaryKey(autoGenerate = true)
    public int ID;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return address;
    }

    public Nurse(int ID, String phoneNumber, String password, String firstName, String lastName,
                 int age, String address) {
        super(ID, phoneNumber, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @NonNull
    @Override
    public String toString() {
        return ID+"|"+firstName +" " + lastName + "|"+age+"|"+getPhoneNumber();
    }
}