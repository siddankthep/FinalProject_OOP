package com.example.finalproject_oop.DAOs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalproject_oop.data_class.Appointment;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;

import java.util.List;

@Dao
public interface DoctorDAO {
    @Insert
    void insertDoctor(Doctor Doctor);

    @Query("SELECT * FROM doctor WHERE phoneNumber = :phoneNumber")
    Doctor getDoctorByPhoneNumber(String phoneNumber);

    @Query("SELECT * FROM doctor WHERE appointments =:appointment")
    Doctor getDoctorByAppointments(List<Appointment> appointment);

    @Query("SELECT * FROM doctor WHERE ID =:id")
    Doctor getDoctorByID(int id);

    @Query("SELECT * FROM doctor")
    List<Doctor> getAllDoctor();

    // You may add more queries for different operations
    @Query("SELECT DISTINCT * FROM doctor WHERE phoneNumber = :username AND password = :password")
    Doctor getDoctorByLogIn(String username, String password);
}
