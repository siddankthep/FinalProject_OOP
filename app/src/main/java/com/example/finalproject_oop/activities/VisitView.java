package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.finalproject_oop.R;


// This class is used to display the details of a visit for all users (doctor, nurse, patient).
public class VisitView extends AppCompatActivity {

    // Declare your TextViews
    private TextView weightText;
    private TextView bloodPressureText;
    private TextView reasonText;
    private TextView diagnosisText;
    private TextView prescriptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_view);

        // Initialize your TextViews
        weightText = findViewById(R.id.weightTextView);
        bloodPressureText = findViewById(R.id.bloodPressureTextView);
        reasonText = findViewById(R.id.reasonTextView);
        diagnosisText = findViewById(R.id.diagnosisTextView);
        prescriptionText = findViewById(R.id.prescriptionTextView);
    }
}