package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityDiagnosisPrescriptionDoctorViewBinding;

public class diagnosisPrescriptionDoctorView extends AppCompatActivity {
    ActivityDiagnosisPrescriptionDoctorViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiagnosisPrescriptionDoctorViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}