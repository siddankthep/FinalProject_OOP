package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Prescription;

import java.util.List;

@Dao
public interface PrescriptionDAO {
    @Insert
    void insertPrescription(Prescription prescription);

    @Query("SELECT * FROM prescription WHERE username = :username")
    List<Prescription> getPrescriptionsForPatient(String username);

    // You may add more queries for different operations
}

