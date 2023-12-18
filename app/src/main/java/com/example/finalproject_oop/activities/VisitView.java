package com.example.finalproject_oop.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.finalproject_oop.R;
import com.example.finalproject_oop.databinding.ActivityVisitViewBinding;


// This class is used to display the details of a visit for all users (doctor, nurse, patient).
public class VisitView extends AppCompatActivity {

    // Declare your TextViews
    ActivityVisitViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVisitViewBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_visit_view);
    }
}