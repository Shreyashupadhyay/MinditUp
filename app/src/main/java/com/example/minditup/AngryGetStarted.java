package com.example.minditup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

/**
 * A simple {@link Fragment} subclass.
 */
public class AngryGetStarted extends Fragment {

    public AngryGetStarted() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_angry_get_started, container, false);
        Button startAgrAssessment= (Button) view.findViewById(R.id.startAgrAssessment);

//        startAgrAssessment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction ft= getFragmentManager().beginTransaction();
//                ft.replace(R.id.angry_FrameLayout,new DrepessionTest());
//                ft.commit();
//            }
//        });

        return view;
    }


}