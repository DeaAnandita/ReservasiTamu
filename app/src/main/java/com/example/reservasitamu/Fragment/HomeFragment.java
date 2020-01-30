package com.example.reservasitamu.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.reservasitamu.DeskripsiPaket1;
import com.example.reservasitamu.R;

public class HomeFragment extends Fragment {

    CardView cvPaket1, cvPaket2, cvPaket3, cvPaket4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        cvPaket1 = view.findViewById(R.id.cvPaket1);
        cvPaket2 = view.findViewById(R.id.cvPaket2);
        cvPaket3 = view.findViewById(R.id.cvPaket3);
        cvPaket4 = view.findViewById(R.id.cvPaket4);

        cvPaket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), DeskripsiPaket1.class));
            }
        });

        cvPaket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), DeskripsiPaket1.class));
            }
        });

        cvPaket3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), DeskripsiPaket1.class));
            }
        });

        cvPaket4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), DeskripsiPaket1.class));
            }
        });

        return view;
    }
}

