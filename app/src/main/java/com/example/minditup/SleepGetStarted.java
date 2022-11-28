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
public class SleepGetStarted extends Fragment {

    public SleepGetStarted() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sleep_get_started, container, false);
        Button startSlpAssessment= (Button) view.findViewById(R.id.startSlpAssessment);

        startSlpAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft= getFragmentManager().beginTransaction();
                ft.replace(R.id.sleep_FrameLayout,new DrepessionTest());
                ft.commit();
            }
        });

        return view;
    }
}