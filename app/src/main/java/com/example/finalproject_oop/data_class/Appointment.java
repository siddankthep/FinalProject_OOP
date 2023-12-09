package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Appointment {
    @PrimaryKey(autoGenerate = true)
    public int ID;
    private String date;
    private String time;
    private Doctor doctor;
    private Patient patient;
    private String reason;

    public Appointment(String date, String time, Doctor doctor, Patient patient, String reason) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
