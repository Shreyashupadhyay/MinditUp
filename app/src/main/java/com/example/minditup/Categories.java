package com.example.minditup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Categories extends AppCompatActivity {

    RelativeLayout depressed, stress, anxiety, sleep, angry, relation;
    TextView deptext, strtext, anxtext, slptext, agrtext, reltext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportActionBar().hide();

        depressed= findViewById(R.id.depressed);
        deptext= findViewById(R.id.deptext);

        anxiety= findViewById(R.id.anxiety);
        anxtext= findViewById(R.id.anxtext);

        angry= findViewById(R.id.angry);
        agrtext= findViewById(R.id.agrtext);

        stress= findViewById(R.id.stress);
        strtext= findViewById(R.id.strtext);

        sleep= findViewById(R.id.sleep);
        slptext= findViewById(R.id.slptext);

        relation= findViewById(R.id.relation);
        reltext= findViewById(R.id.reltext);





//        OnClicks

        depressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String detext = deptext.getText().toString();
                if(detext.equals("Overcoming Depression")){
                    startActivity(new Intent(Categories.this,DepressedActivity.class));
                    deptext.setText("Overcoming Depression.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });



        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String antext = anxtext.getText().toString();
                if(antext.equals("Beating Anxiety")){
                    startActivity(new Intent(Categories.this,AnxietyActivity.class));
                    anxtext.setText("Beating Anxiety.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });



        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String agtext = agrtext.getText().toString();
                if(agtext.equals("Managing Anger")){
                    startActivity(new Intent(Categories.this,AngryActivity.class));
                    agrtext.setText("Managing Anger.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });



        stress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sttext = strtext.getText().toString();
                if(sttext.equals("Tackling Stress")){
                    startActivity(new Intent(Categories.this,StressActivity.class));
                    strtext.setText("Tackling Stress.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });



        sleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sltext = slptext.getText().toString();
                if(sltext.equals("Sleeping Better")){
                    startActivity(new Intent(Categories.this,SleepActivity.class));
                    slptext.setText("Sleeping Better.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });



        relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String retext = reltext.getText().toString();
                if(retext.equals("Managing Relationships")){
                    startActivity(new Intent(Categories.this,RelationActivity.class));
                    reltext.setText("Managing Relationships.");
                }else{
                    startActivity(new Intent(Categories.this,MainActivity.class));
                }


            }
        });
    }
}