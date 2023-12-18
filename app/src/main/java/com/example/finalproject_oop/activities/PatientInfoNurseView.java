package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.data_class.Appointment;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.data_class.Visit;
import com.example.finalproject_oop.databinding.ActivityPatientInfoNurseViewBinding;

public class PatientInfoNurseView extends AppCompatActivity {
    AppDB appDB;
    Appointment appointment;
    int userID;
    ActivityPatientInfoNurseViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPatientInfoNurseViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        appDB = AppDB.getINSTANCE(this);
        userID = getIntent().getIntExtra("ID",-1);
        appointment = appDB.appointmentDAO().getAppointment();
        binding.patientNameTextView.setText(appointment.getPatient().getFirstName());
        binding.phoneNumTextView.setText(appointment.getPatient().getPhoneNumber());
        binding.saveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Visit visit = new Visit(appointment.getPatient(),appDB.nurseDAO().getNurseByID(userID),
                        (Doctor) binding.doctorSpinner.getSelectedItem(),
                        Double.parseDouble(binding.weightEditTextNumber.getText().toString()),
                        binding.bloodPressurEditTextNumber2.getText().toString(),
                        binding.reasonEditText.getText().toString(),"Heart attack","Dead");
                appDB.visitDAO().insertAll(visit);
                Intent intent = new Intent(PatientInfoNurseView.this, MainActivity.class);
                intent.putExtra("ID",userID);
                PatientInfoNurseView.this.startActivity(intent);
            }
        });
    }
}