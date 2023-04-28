package com.example.conter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    Button btnRegister, btnKembali;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnKembali = findViewById(R.id.btnKembali);
        btnRegister = findViewById(R.id.btnRegister);

        btnKembali.setOnClickListener(view -> {
            Intent kembali = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(kembali);
        });

        btnRegister.setOnClickListener(view -> {
            Intent Register = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(Register);
        });
    }
}
