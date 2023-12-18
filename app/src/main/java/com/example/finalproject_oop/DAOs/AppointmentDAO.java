package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.example.finalproject_oop.data_class.Appointment;

import java.util.List;

@Dao
public interface AppointmentDAO {
    @Insert
    void addAppointment(Appointment a1);


    // You may add more queries for different operation
    @Query("select * from a1 where id = :id")
    Appointment getAppointmentByID(int id);

    @Query("select * from a1 where date = :date")
    Appointment getAppointmentByDate(String date);

    @Query("select * from a1 where time = :time")
    Appointment getAppointmentByTime(String time);

    @Query("select * from a1 limit 1")
    Appointment getAppointment();




}
