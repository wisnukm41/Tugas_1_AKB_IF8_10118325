package com.example.tugas1akbif810118325;
// Tanggal Pengerjaan : 08/04/2021
// NIM : 10118325
// Nama : Wisnu Murfadilah Rokhsan
// Kelas : if8 2018
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}
