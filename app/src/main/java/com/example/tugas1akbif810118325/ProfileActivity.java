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

public class ProfileActivity extends AppCompatActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();
        setData();
    }

    public void initView() {
        btnBack = findViewById(R.id.btn_back);
    }

    public void setData() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}