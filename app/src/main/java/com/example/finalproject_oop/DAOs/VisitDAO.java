package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.data_class.Visit;
import com.example.finalproject_oop.data_class.Doctor;

@Dao
public interface VisitDAO {

    @Insert
    void insertAll(Visit... visits);

    @Query("SELECT * FROM visit")
    Visit[] getAll();

    @Query("select * from visit where doctor =:doctor")
    Visit getVisitByDoctor(Doctor doctor);

    @Query("select * from visit where patient =:patient")
    Visit getVisitByPatient(Patient patient);







    // More queries can be added here
}
