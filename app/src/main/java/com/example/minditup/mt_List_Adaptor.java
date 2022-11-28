package com.example.minditup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class mt_List_Adaptor extends ArrayAdapter<mtListValues> {

    private LayoutInflater layoutInflater;
    private ArrayList<mtListValues> arrayList;

    public mt_List_Adaptor(@NonNull Context context, int resource,  ArrayList<mtListValues> arrayList) {
        super(context, resource);
        this.arrayList=arrayList;
        layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public mtListValues getItem(int Position) {
        return arrayList.get(Position);
    }

    public View getView(int position, View convertview, ViewGroup parents){
        convertview =LayoutInflater.from(getContext()).inflate(R.layout.list_design,parents,false);
        mtListValues values =arrayList.get(position);
        if (values!=null){
            TextView status=(TextView)convertview.findViewById(R.id.status);
            TextView reason=(TextView)convertview.findViewById(R.id.mtreason);
            TextView date=(TextView) convertview.findViewById(R.id.mtdate);
            TextView time=(TextView)convertview.findViewById(R.id.mttime);

            if (status !=null){
                status.setText(values.getStatus());
            }
            if (reason !=null){
                reason.setText(values.getReason());
            }
            if (date !=null){
                date.setText(values.getDate());
            }
            if (time !=null){
                time.setText(values.getTime());
            }
        }
        return convertview;
    }

}
