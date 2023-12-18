package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctor extends User {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    private String firstName, lastName;
    private List<Appointment> appointments;

    public Doctor(int ID, String phoneNumber, String password, String firstName, String lastName) {
        super(ID, phoneNumber, password);
        this.appointments = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and setter for specialization

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }


    // Additional methods for handling appointments and assigned visits
}