package com.example.student.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBClass extends SQLiteOpenHelper{
    private Context context;
    public static final String DATABSE_NAME="student.db";
    public static final String TABLE_NAME="student";
    public static final String ID="ID";
    public static final String NAME="NAME";

    public DBClass(Context context) {
        super(context, DATABSE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE  "+ TABLE_NAME + "(" + ID+ " integer primary key autoincrement, " + NAME  + "Text" +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
