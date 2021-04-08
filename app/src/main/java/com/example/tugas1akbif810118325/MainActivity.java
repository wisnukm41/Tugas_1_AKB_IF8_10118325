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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnProfile,btnLogout;
    private TextView tvUsername;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();
    }

    public void initView(){
        tvUsername = findViewById(R.id.txt_user);
        btnLogout = findViewById(R.id.btn_logout);
        btnProfile = findViewById(R.id.btn_profile);
    }

    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        tvUsername.setText(username);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    };
}