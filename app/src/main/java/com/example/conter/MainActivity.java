package com.example.conter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnHome, btnRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHome = findViewById(R.id.btnHome);
        btnRegister = findViewById(R.id.btnRegister);

        btnHome.setOnClickListener(view -> {
            Intent Home = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(Home);
        });

        btnRegister.setOnClickListener(view -> {
            Intent Register = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(Register);
        });
    }

}