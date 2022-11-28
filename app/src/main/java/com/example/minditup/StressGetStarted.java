package com.example.minditup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class StressGetStarted extends Fragment {

    public StressGetStarted() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stress_get_started, container, false);
        Button startStrAssessment= (Button) view.findViewById(R.id.startStrAssessment);

        startStrAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft= getFragmentManager().beginTransaction();
                ft.replace(R.id.stress_FrameLayout,new StressTest());
                ft.commit();
            }
        });

        return view;
    }
}