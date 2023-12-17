package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityPatientInfoNurseViewBinding;

public class PatientInfoNurseView extends AppCompatActivity {
    ActivityPatientInfoNurseViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPatientInfoNurseViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}