package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.finalproject_oop.R;

public class LoginActivity extends AppCompatActivity {

    // Declare your views
    private EditText username;
    private EditText password;
    private Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize your views
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signButton = findViewById(R.id.signButton);
    }
}