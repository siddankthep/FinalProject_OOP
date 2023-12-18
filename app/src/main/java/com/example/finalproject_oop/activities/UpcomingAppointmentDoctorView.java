package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityUpcomingAppointmentDoctorViewBinding;

public class UpcomingAppointmentDoctorView extends AppCompatActivity {
    ActivityUpcomingAppointmentDoctorViewBinding binding;
    String[] appointments
            = { "Sid", "Huy",
            "Phuong"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityUpcomingAppointmentDoctorViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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