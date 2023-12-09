package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Patient;

//import java.util.List;

@Dao
public interface PatientDAO {
    @Insert
    void insertPatient(Patient patient);

    @Query("SELECT * FROM patient WHERE phoneNumber = :phoneNumber")
    Patient getPatientByPhoneNumber(String phoneNumber);

    // You may add more queries for different operations
}
