package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Nurse;

import java.util.List;

@Dao
public interface NurseDAO {
    @Insert
    void insertNurse(Nurse nurse);

    @Query("SELECT * FROM nurse WHERE phoneNumber = :phoneNumber")
    Nurse getNurseByPhoneNumber(String phoneNumber);

    @Query("SELECT * FROM nurse WHERE id = :id")
    Nurse getNurseByID(int id);

    // You may add more queries for different operations

    @Query("SELECT DISTINCT * FROM nurse WHERE phoneNumber = :username AND password = :password")
    Nurse getNurseByLogIn(String username, String password);
    @Query("SELECT DISTINCT * FROM nurse")
    List<Nurse> getAllNurse();
}

