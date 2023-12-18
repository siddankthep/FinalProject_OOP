package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.databinding.ActivityUpdatePersonalInfoBinding;

public class UpdatePersonalInfo extends AppCompatActivity {
    int userID;
    Patient patient;
    ActivityUpdatePersonalInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdatePersonalInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        userID = getIntent().getIntExtra("ID",-1);
        patient = AppDB.getINSTANCE(this).patientDAO().getPatientByID(userID);
        binding.firstNameEditText.setText(patient.getFirstName());
        binding.lastNameEditText.setText(patient.getLastName());
        binding.phoneNumEditText.setText(patient.getPhoneNumber());
        binding.ageEditText.setText(patient.getAge());
        binding.addressEditText.setText(patient.getAddress());
        binding.saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppDB.getINSTANCE(binding.getRoot().getContext()).patientDAO().updatePatientById(userID,
                        binding.firstNameEditText.getText().toString(),
                        binding.lastNameEditText.getText().toString(),
                        binding.phoneNumEditText.getText().toString(),
                        binding.addressEditText.getText().toString(),
                        Integer.parseInt(binding.ageEditText.getText().toString()));
                Intent intent = new Intent(UpdatePersonalInfo.this,PersonalInfo.class);
                intent.putExtra("ID",intent);
                UpdatePersonalInfo.this.startActivity(intent);
            }
        });
    }
}