package com.example.finalproject_oop.DAOs;

import androidx.room.TypeConverter;

import com.example.finalproject_oop.data_class.Appointment;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.data_class.Prescription;
import com.example.finalproject_oop.data_class.Visit;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class Converters {
    private static Gson gson = new Gson();

    @TypeConverter
    public static List<Appointment> stringToAppointmentList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<Appointment>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String appointmentListToString(List<Appointment> someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static List<Visit> stringToVisitList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<Visit>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String visitListToString(List<Visit> someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static Patient stringToPatient(String data) {
        return gson.fromJson(data, Patient.class);
    }

    @TypeConverter
    public static String patientToString(Patient patient) {
        return gson.toJson(patient);
    }

    @TypeConverter
    public static Doctor stringToDoctor(String data) {
        return gson.fromJson(data, Doctor.class);
    }

    @TypeConverter
    public static String doctorToString(Doctor doctor) {
        return gson.toJson(doctor);
    }

    @TypeConverter
    public static Nurse stringToNurse(String data) {
        return gson.fromJson(data, Nurse.class);
    }

    @TypeConverter
    public static String nurseToString(Nurse nurse) {
        return gson.toJson(nurse);
    }

    @TypeConverter
    public static Prescription stringToPrescription(String data) {
        return gson.fromJson(data, Prescription.class);
    }

    @TypeConverter
    public static String prescriptionToString(Prescription prescription) {
        return gson.toJson(prescription);
    }

}