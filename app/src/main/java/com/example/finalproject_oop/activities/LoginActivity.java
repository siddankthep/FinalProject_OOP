package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    // Declare your views
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("USR", binding.username.getText().toString());
                intent.putExtra("PASS", binding.password.getText().toString());
                LoginActivity.this.startActivity(intent);
            }
        });
    }
}