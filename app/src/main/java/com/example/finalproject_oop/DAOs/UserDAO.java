package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.User;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insertUser(User user);

    @Query("SELECT * FROM user WHERE phoneNumber = :phoneNumber")
    User getUserByPhoneNumber(String phoneNumber);

    @Query("SELECT * FROM user WHERE id = :id")
    User getUserByID(int id);



    // You may add more queries for different operations
}

