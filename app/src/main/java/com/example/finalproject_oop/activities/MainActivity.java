package com.example.finalproject_oop.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.finalproject_oop.DAOs.AppDB;
import com.example.finalproject_oop.DAOs.DoctorDAO;
import com.example.finalproject_oop.DAOs.NurseDAO;
import com.example.finalproject_oop.DAOs.PatientDAO;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.data_class.Doctor;
import com.example.finalproject_oop.data_class.Nurse;
import com.example.finalproject_oop.data_class.Patient;
import com.example.finalproject_oop.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActivityMainBinding binding;
    Patient patient;
    Doctor doctor;
    Nurse nurse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.navView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,binding.drawer,binding.toolbarAppointItem,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        binding.drawer.addDrawerListener(toggle);
        toggle.syncState();
        Intent receive = getIntent();
        String username = receive.getStringExtra("USR");
        String password = receive.getStringExtra("PASS");
        int id = receive.getIntExtra("ID",-1);
        if (username != null) {
            int res = logInResult(username, password);
            if (res != -1){
                binding.loginButton.setVisibility(View.INVISIBLE);
                binding.fourActivity.setVisibility(View.VISIBLE);
            }
            if (res == 0){
                binding.addPatient.setVisibility(View.INVISIBLE);
            }
            Log.d("Checking", AppDB.getINSTANCE(this).nurseDAO().getAllNurse().toString());
        } else if (id != - 1) {
            nurse = AppDB.getINSTANCE(this).nurseDAO().getNurseByID(id);
            patient = AppDB.getINSTANCE(this).patientDAO().getPatientByID(id);
            doctor = AppDB.getINSTANCE(this).doctorDAO().getDoctorByID(id);
        } else if (username == null && id == -1) {
            binding.loginButton.setVisibility(View.VISIBLE);
            binding.fourActivity.setVisibility(View.INVISIBLE);
        }
        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        binding.navView.setNavigationItemSelectedListener(this);
        binding.addPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                intent.putExtra("ID", getUserID());
                MainActivity.this.startActivity(intent);
            }
        });
        binding.appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (patient != null){
                    Intent intent = new Intent(MainActivity.this, AppointmentItemActivity.class);
                    intent.putExtra("ID", getUserID());
                    MainActivity.this.startActivity(intent);
                }else if (nurse != null){
                    Intent intent = new Intent(MainActivity.this, PatientInfoNurseView.class);
                    intent.putExtra("ID", getUserID());
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        if(binding.drawer.isDrawerOpen(GravityCompat.START)){
            binding.drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    private int getUserID(){
        if(patient != null){
            return patient.getID();
        } else if (nurse != null) {
            return nurse.getID();
        }else{
            return doctor.getID();
        }
    }
    private int logInResult(String username, String password){
        nurse = AppDB.getINSTANCE(this).nurseDAO().getNurseByLogIn(username,password);
        patient = AppDB.getINSTANCE(this).patientDAO().getPatientByLogIn(username,password);
        doctor = AppDB.getINSTANCE(this).doctorDAO().getDoctorByLogIn(username,password);
        if(patient != null){
            return 0;
        } else if (nurse != null) {
            return 1;
        }else if (doctor != null){
            return 2;
        }else {
            return -1;
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_home) {
            return true;
        } else if (item.getItemId() == R.id.nav_settings){
            Intent intent = new Intent(MainActivity.this, PersonalInfo.class);
            intent.putExtra("ID", getUserID());
            MainActivity.this.startActivity(intent);
        }else if(item.getItemId() == R.id.nav_logout){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            MainActivity.this.startActivity(intent);
        }
        return true;
    }
}