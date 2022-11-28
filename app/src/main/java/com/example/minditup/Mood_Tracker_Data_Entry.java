package com.example.minditup;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Mood_Tracker_Data_Entry extends AppCompatActivity {
//    TextView mtstatus;
//    EditText mtreason,mtdate,mttime;
//    Button mtaddbtn;
//    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker_data_entry);

//        mtstatus = findViewById(R.id.status);
//        mtreason = findViewById(R.id.mtreasonbox);
//        mtdate = findViewById(R.id.mtdatebox);
//        mttime = findViewById(R.id.mttimebox);
//        mtaddbtn = findViewById(R.id.mtaddbtn);

//        mydb= new DatabaseHelper(this);

//        mtaddbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String statustext =mtstatus.getText().toString();
////                String reasontext =mtreason.getText().toString();
////                String datetext =mtdate.getText().toString();
////                String timetext=mttime.getText().toString();
////                if (reasontext.isEmpty() || statustext.isEmpty() || datetext.isEmpty()){
////                    Toast.makeText(Mood_Tracker_Data_Entry.this, "Enter The Data", Toast.LENGTH_SHORT).show();
////                }else {
////                    boolean inserted = mydb.insertdata(statustext,reasontext,datetext,timetext);
////                    if (inserted == true) {
////                        Toast.makeText(Mood_Tracker_Data_Entry.this, "Data Inserted", Toast.LENGTH_SHORT).show();
////                    } else {
////                        Toast.makeText(Mood_Tracker_Data_Entry.this, "Data Not Inserted", Toast.LENGTH_SHORT).show();
////                    }
////                    mtreason.setText("");
////                    mtdate.setText("");
////                    mttime.setText("");
////                    Toast.makeText(Mood_Tracker_Data_Entry.this, "working", Toast.LENGTH_SHORT).show();
////                    startActivity(new Intent(Mood_Tracker_Data_Entry.this,Mood_Tracker_List.class));
////                }
//            }
//        });




    }
}