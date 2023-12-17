package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityAppointmentItemBinding;

public class AppointmentItemActivity extends AppCompatActivity {
    ActivityAppointmentItemBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppointmentItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}