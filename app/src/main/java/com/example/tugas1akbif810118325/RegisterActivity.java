package com.example.tugas1akbif810118325;
// Tanggal Pengerjaan : 08/04/2021
// NIM : 10118325
// Nama : Wisnu Murfadilah Rokhsan
// Kelas : if8 2018
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setData();
    }
    public void initView() {
        btnRegister = findViewById(R.id.btn_register);
    }

    public void setData() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}