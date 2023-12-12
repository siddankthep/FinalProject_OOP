package com.example.finalproject_oop.DAOs;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.finalproject_oop.data_class.Appointment;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.data_class.Prescription;
import com.example.finalproject_oop.data_class.User;
import com.example.finalproject_oop.data_class.Visit;

@Database(entities = {Patient.class, Nurse.class, Doctor.class, Visit.class, Appointment.class, Prescription.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDB extends RoomDatabase {
    public abstract PatientDAO patientDAO();
    public abstract NurseDAO nurseDAO();
    public abstract DoctorDAO doctorDAO();
    public abstract VisitDAO visitDAO();
    public abstract AppointmentDAO appointmentDAO();
    public abstract PrescriptionDAO prescriptionDAO();



    // You can include other DAOs if needed
}

