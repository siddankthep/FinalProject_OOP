package com.example.finalproject_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UpcomingAppointmentDoctorView extends AppCompatActivity {

    String[] appointments
            = { "Sid", "Huy",
            "Phuong"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_appointment_doctor_view);
        ListView l = findViewById(R.id.appointmentList);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<>(
                this,
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                appointments);
        l.setAdapter(arr);
    }
}