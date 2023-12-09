package com.example.finalproject_oop.data_class;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Visit {
    public Visit(Patient patient, Nurse nurse, Doctor doctor, double weight, String bloodPressure, String reason, String diagnosis, String prescription) {
        this.patient = patient;
        this.nurse = nurse;
        this.doctor = doctor;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.reason = reason;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    @PrimaryKey(autoGenerate = true)
    public int ID;
    private Patient patient;
    private Nurse nurse;
    private Doctor doctor;
    private double weight;
    private String bloodPressure;
    private String reason;
    private String diagnosis;
    private String prescription;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}

