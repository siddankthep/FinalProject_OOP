package com.example.finalproject_oop.data_class;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient extends User {
    @PrimaryKey(autoGenerate = true)
    private int ID;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String profileImageLink;
    private List<Appointment> appointments;
    private List<Visit> visits;

    public Patient(String phoneNumber, String password, String firstName, String lastName,
                   int age, String address) {
        super(phoneNumber, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.appointments = new ArrayList<>();
        this.visits = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProfileImageLink(String profileImageLink) {
        this.profileImageLink = profileImageLink;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getProfileImageLink() {
        return profileImageLink;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    @NonNull
    @Override
    public String toString() {
        return ID+"|"+firstName +" " + lastName + "|"+age+"|"+getPhoneNumber();
    }
}
