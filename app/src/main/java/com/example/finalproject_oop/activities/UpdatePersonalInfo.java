package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityUpdatePersonalInfoBinding;

public class UpdatePersonalInfo extends AppCompatActivity {
    ActivityUpdatePersonalInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdatePersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}