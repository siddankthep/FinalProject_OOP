package com.example.finalproject_oop.DAOs;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
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

    private static volatile AppDB INSTANCE;
    public static AppDB getINSTANCE(Context context){
        if(INSTANCE == null){
            synchronized (AppDB.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext()
                            ,AppDB.class,"Hospital DB").allowMainThreadQueries().build();
                    INSTANCE.nurseDAO().insertNurse(new Nurse(0,"admin","12345","Admin","",0,""));
                    INSTANCE.doctorDAO().insertDoctor(new Doctor(1,"987","12345", "Sid", "Dank"));
                    INSTANCE.doctorDAO().insertDoctor(new Doctor(2,"988","12346", "Ha", "Huy"));

                }
            }
        }
        return INSTANCE;
    }
    public abstract PatientDAO patientDAO();
    public abstract NurseDAO nurseDAO();
    public abstract DoctorDAO doctorDAO();
    public abstract VisitDAO visitDAO();
    public abstract AppointmentDAO appointmentDAO();
    public abstract PrescriptionDAO prescriptionDAO();



    // You can include other DAOs if needed
}

