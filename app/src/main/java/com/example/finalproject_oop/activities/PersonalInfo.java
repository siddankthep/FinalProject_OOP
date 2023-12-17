package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityPersonalInfoBinding;

public class PersonalInfo extends AppCompatActivity {
    ActivityPersonalInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}