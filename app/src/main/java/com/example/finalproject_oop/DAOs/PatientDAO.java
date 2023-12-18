package com.example.finalproject_oop.DAOs;

import android.graphics.Paint;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;

import java.util.List;

//import java.util.List;

@Dao
public interface PatientDAO {
    @Insert
    void insertPatient(Patient patient);

    @Query("SELECT * FROM patient WHERE phoneNumber = :phoneNumber")
    Patient getPatientByPhoneNumber(String phoneNumber);

    @Query("SELECT * FROM patient WHERE firstName = :firstName")
    Patient getPatientByFirstName(String firstName);

    @Query("SELECT * FROM patient WHERE lastName = :lastName")
    Patient getPatientByLastName(String lastName);

    @Query("SELECT * FROM patient WHERE id = :id")
    Patient getPatientByID(int id);
    // You may add more queries for different operations
    @Query("SELECT DISTINCT * FROM patient WHERE phoneNumber = :username AND password = :password")
    Patient getPatientByLogIn(String username, String password);
    @Query("SELECT * FROM patient")
    List<Patient> getAllPatient();

    @Query("UPDATE patient SET firstName = :fName, lastName = :lName, phoneNumber = :phone, address = :address, age = :age WHERE ID = :id")
    void updatePatientById(int id, String fName, String lName, String phone, String address, int age);
}
