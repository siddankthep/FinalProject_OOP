package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.databinding.ActivityPersonalInfoBinding;

public class PersonalInfo extends AppCompatActivity {
    ActivityPersonalInfoBinding binding;
    int userID;
    Patient patient;
    AppDB appDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        appDB = AppDB.getINSTANCE(this);
        userID = getIntent().getIntExtra("ID",-1);
        patient = appDB.patientDAO().getPatientByID(userID);
        binding.firstNameTextView.setText(patient.getFirstName());
        binding.weightTextView.setText(patient.getLastName());
        binding.ageTextView.setText(patient.getAge());
        binding.addressTextView.setText(patient.getAddress());
        binding.phoneTextView.setText(patient.getPhoneNumber());
        binding.updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalInfo.this, UpdatePersonalInfo.class);
                intent.putExtra("ID",userID);
                PersonalInfo.this.startActivity(intent);
            }
        });
    }
}