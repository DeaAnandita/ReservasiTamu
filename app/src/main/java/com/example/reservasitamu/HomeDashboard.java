package com.example.reservasitamu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeDashboard extends AppCompatActivity {

    CardView cvPaket1, cvPaket2, cvPaket3, cvPaket4;
    ImageView icprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        icprofil = findViewById(R.id.icprofil);
        cvPaket1 = findViewById(R.id.cvPaket1);
        cvPaket2 = findViewById(R.id.cvPaket2);
        cvPaket3 = findViewById(R.id.cvPaket3);
        cvPaket4 = findViewById(R.id.cvPaket4);

        cvPaket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, DeskripsiPaket1.class));
            }
        });

        cvPaket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, DeskripsiPaket1.class));
            }
        });

        cvPaket3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, DeskripsiPaket1.class));
            }
        });

        cvPaket4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, DeskripsiPaket1.class));
            }
        });

        icprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, Login.class));
            }
        });

    }
}
