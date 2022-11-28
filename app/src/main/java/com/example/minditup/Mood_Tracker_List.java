package com.example.minditup;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Mood_Tracker_List extends AppCompatActivity {
    DatabaseHelper mydb;
    ArrayList<mtListValues> arrayList;
    ListView listView;
    mtListValues values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker_list);

        listView = findViewById(R.id.listview);
        arrayList= new ArrayList<>();


        Cursor data =mydb.getalldata();
        int noofitem =data.getCount();
        if (noofitem==0){
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
        }else{
            int i=0;
            while (data.moveToNext()){
                values= new mtListValues(data.getString(0),data.getString(1),data.getString(2),data.getString(3));
                arrayList.add(i,values);
                i++;
            }

            mt_List_Adaptor adaptor = new mt_List_Adaptor(this, R.layout.list_design,arrayList);
            listView.setAdapter(adaptor);
        }

    }
}