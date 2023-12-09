package com.example.finalproject_oop.DAOs;

import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Visit;

public interface VisitDAO {

    @Insert
    void insertAll(Visit... visits);

    @Query("SELECT * FROM visit")
    Visit[] getAll();

    // More queries can be added here
}