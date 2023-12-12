package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Prescription {

    @PrimaryKey(autoGenerate = true)
    public int id;

    private String username; // Patient's username
    private String medicationName;
    private int quantity;
    private String instructions;

    // Constructors, getters, and setters

    // For simplicity, you can generate these methods in Android Studio

    public Prescription(String username, String medicationName, int quantity, String instructions) {
        this.username = username;
        this.medicationName = medicationName;
        this.quantity = quantity;
        this.instructions = instructions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}

