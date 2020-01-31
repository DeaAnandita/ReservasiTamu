package com.example.reservasitamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reservasitamu.Fragment.MainFragment;

public class Registarsi extends AppCompatActivity {

    Button btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnRegistrasi = findViewById(R.id.btnRegistrasi);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registarsi.this, MainFragment.class));
                finish();
            }
        });

    }
}
