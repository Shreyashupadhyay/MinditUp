package com.example.minditup;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);

        ImageView mt1= v.findViewById(R.id.mt1);
        ImageView mt2= v.findViewById(R.id.mt2);
        ImageView mt3= v.findViewById(R.id.mt3);
        ImageView mt4= v.findViewById(R.id.mt4);
        ImageView mt5= v.findViewById(R.id.mt5);
        ImageView mt6= v.findViewById(R.id.mt6);
        ImageView mt7= v.findViewById(R.id.mt7);
        ImageView mt8= v.findViewById(R.id.mt8);
        Button memeactivitybtn= v.findViewById(R.id.memeactivity);

        memeactivitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),WalkingActivity.class));
            }
        });

        mt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });
        mt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Demo_entry.class);
                startActivity(i);
            }
        });






        return v;
    }
}