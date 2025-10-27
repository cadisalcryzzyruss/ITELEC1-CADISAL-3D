package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNum = findViewById(R.id.firstNum);
        final EditText secNum = findViewById(R.id.secondNum);
        Button btnAdd = findViewById(R.id.addBtn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstText = firstNum.getText().toString().trim();
                String secondText = secNum.getText().toString().trim();
                if (firstText.isEmpty() || secondText.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        int num1 = Integer.parseInt(firstText);
                        int num2 = Integer.parseInt(secondText);
                        int sum = num1 + num2;
                        Toast.makeText(getApplicationContext(), "SUM = " + sum, Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(), "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
