package com.example.minditup;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="moodRecord";
    public static final String TABLE_NAME="mood_records";
    public static final String COL1="TAKEN_STATUS";
    public static final String COL2="TAKEN_REASON";
    public static final String COL3="TAKEN_DATE";
    public static final String COL4="TAKEN_TIME";



    public DatabaseHelper(@Nullable Context context) {
        super(context,DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (TAKEN_STATUS TEXT,TAKEN_REASON TEXT,TAKEN_DATE INT, TAKEN_TIME INT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop Table If Exists "+TABLE_NAME );
        onCreate(db);
    }

    public boolean insertdata(String status,String reason,String date,String time){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1,status);
        contentValues.put(COL2,reason);
        contentValues.put(COL3,date);
        contentValues.put(COL4,time);
        long result=db.insert(TABLE_NAME,null,contentValues);
        return result != -1;
    }
    public Cursor getalldata(){
        SQLiteDatabase db= this.getWritableDatabase();
        return db.rawQuery("Select * from " + TABLE_NAME,null);
    }

}
