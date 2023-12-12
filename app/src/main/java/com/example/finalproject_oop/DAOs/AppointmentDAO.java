package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Appointment;

import java.util.List;

@Dao
public interface AppointmentDAO {
    @Insert
    void insertAppointment(Appointment Appointment);

    @Query("SELECT * FROM appointment WHERE id = :id")
    Appointment getAppointmentByID(int id);

    // You may add more queries for different operations
}
