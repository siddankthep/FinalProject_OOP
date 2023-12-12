package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.finalproject_oop.R;

public class PersonalInfo extends AppCompatActivity {
    ImageView backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        backButton = findViewById(R.id.backButton);

    }
}