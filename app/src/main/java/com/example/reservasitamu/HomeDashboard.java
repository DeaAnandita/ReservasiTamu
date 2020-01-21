package com.example.reservasitamu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeDashboard extends AppCompatActivity {

    CardView cvPaket1, cvPaket2, cvPaket3, cvPaket4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        cvPaket1 = findViewById(R.id.cvPaket1);

        cvPaket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeDashboard.this, Booking.class));
            }
        });

    }
}
