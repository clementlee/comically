package com.plushiesinspace.comically;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by cleme_000 on 10/17/13.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    DatabaseHelper(Context c) {
        super(c, "lol", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
