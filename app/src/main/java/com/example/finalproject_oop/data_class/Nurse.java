package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Nurse extends User {
    @PrimaryKey(autoGenerate = true)
    public int ID;
    public Nurse(int ID, String phoneNumber, String password) {
        super(ID, phoneNumber, password);
    }
}