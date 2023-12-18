package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.adapter.DoctorSpinnerAdapter;
import com.example.finalproject_oop.data_class.Appointment;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.databinding.ActivityAppointmentItemBinding;

public class AppointmentItemActivity extends AppCompatActivity {
    AppDB appDB;
    Appointment appointment;
    int userID;
    ActivityAppointmentItemBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppointmentItemBinding.inflate(getLayoutInflater());
        appDB = AppDB.getINSTANCE(this);
        setContentView(binding.getRoot());
        appointment = new Appointment();
        Intent receive = getIntent();
        userID = receive.getIntExtra("ID",-1);
        DoctorSpinnerAdapter adapter = new DoctorSpinnerAdapter(AppointmentItemActivity.this, R.layout.doc_spinner, appDB.doctorDAO().getAllDoctor());
        binding.doctorSpinner.setAdapter(adapter);
        binding.symptomsEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v!= null){
                    Activity activity = getParent();
                    InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
            }
        });
        binding.continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appointment.setPatient(appDB.patientDAO().getPatientByID(userID));
                appointment.setDoctor((Doctor) binding.doctorSpinner.getSelectedItem());
                appointment.setSympton(binding.symptomsEditText.getText().toString());
                appointment.setDate(binding.datePicker.getDayOfMonth()+"/"+binding.datePicker.getMonth()+"/"+binding.datePicker.getYear());
                appointment.setTime(binding.timeSpinner.getSelectedItem().toString());
                appDB.appointmentDAO().addAppointment(appointment);
                Intent intent = new Intent(AppointmentItemActivity.this, MainActivity.class);
                intent.putExtra("ID",userID);
                AppointmentItemActivity.this.startActivity(intent);
            }
        });
    }
}