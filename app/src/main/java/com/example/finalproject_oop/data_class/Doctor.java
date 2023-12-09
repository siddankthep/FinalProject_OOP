package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctor extends User {
    @PrimaryKey(autoGenerate = true)
    private int ID;

    private List<Appointment> appointments;

    public Doctor(int ID, String phoneNumber, String password) {
        super(ID, phoneNumber, password);
        this.appointments = new ArrayList<>();
    }

    // Getter and setter for specialization

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }


    // Additional methods for handling appointments and assigned visits
}