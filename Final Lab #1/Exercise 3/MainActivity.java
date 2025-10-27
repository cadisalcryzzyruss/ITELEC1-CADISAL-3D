package com.example.mainactivity;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize controls
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        Spinner spinnerOptions = findViewById(R.id.spinnerOptions);
        // AutoCompleteTextView: Sample countries
        String[] countries = {"United States", "Canada", "United Kingdom", "Australia", "Germany"};
        ArrayAdapter<String> autoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        autoCompleteTextView.setAdapter(autoAdapter);
        // Spinner: 5 sample options
        String[] options = {"United States", "Canada", "United Kingdom", "Australia", "Germany"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(spinnerAdapter);
    }
}