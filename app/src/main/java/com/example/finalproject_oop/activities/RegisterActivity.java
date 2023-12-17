package com.example.finalproject_oop.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    private final int GALLERY_REQ_CODE = 1000;
    private AppDB appDB;
    Nurse nurse;
    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        appDB = AppDB.getINSTANCE(binding.getRoot().getContext());
        nurse = appDB.nurseDAO().getNurseByID(getIntent().getIntExtra("ID",-1));
        binding.addProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getImage = new Intent(Intent.ACTION_PICK);
                getImage.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(getImage,GALLERY_REQ_CODE);
            }
        });
        binding.saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = AppDB.getINSTANCE(binding.getRoot().getContext()).patientDAO().getAllPatient().size()+1;
                Patient patient = new Patient(id,binding.phoneNumEditText.getText().toString(),"123456"
                        ,binding.firstNameEditText.getText().toString()
                        ,binding.lastNameEditText.getText().toString()
                        ,Integer.parseInt(binding.ageEditText.getText().toString())
                        ,binding.addressEditText.getText().toString());
                appDB.patientDAO().insertPatient(patient);
                Log.d("Data",AppDB.getINSTANCE(binding.getRoot().getContext()).patientDAO().getAllPatient().toString());
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                intent.putExtra("ID",nurse.getID());
                RegisterActivity.this.startActivity(intent);
            }
        });
        binding.appointBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                intent.putExtra("ID",nurse.getID());
                RegisterActivity.this.startActivity(intent);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (resultCode == RESULT_OK && requestCode == GALLERY_REQ_CODE){
            binding.profileImage.setImageURI(data.getData());
        }
    }
}