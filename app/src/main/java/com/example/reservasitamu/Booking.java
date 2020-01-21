package com.example.reservasitamu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Booking extends AppCompatActivity {

    LinearLayout date_time;
    TextView tvTanggal, tvJam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        tvJam = findViewById(R.id.tvJam);
        tvTanggal = findViewById(R.id.tvTanggal);
        date_time = findViewById(R.id.date_time);

        date_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Calendar calendar = Calendar.getInstance();
                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

                        calendar.set(Calendar.YEAR,year);
                        calendar.set(Calendar.MONTH,month);
                        calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);

                        TimePickerDialog.OnTimeSetListener timeSetListener = new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {

                                calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
                                calendar.set(Calendar.MINUTE,minute);

                                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("EEE, d MMM, yyyy");
                                SimpleDateFormat simpleTimeFormat=new SimpleDateFormat("HH:mm");

                                tvTanggal.setText(simpleDateFormat.format(calendar.getTime()));
                                tvJam.setText(simpleTimeFormat.format(calendar.getTime()));

                            }
                        };

                        new TimePickerDialog(Booking.this,timeSetListener,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),false).show();

                    }
                };

                new DatePickerDialog(Booking.this,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();


            }
        });

    }
}
