package com.training.csmodulmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "modules.db";
    public static final String PTABLE_NAME = "module_table";
    public static final String CTABLE_NAME = "node_table";
    public static final String MODULE_NAME = "module";
    public static final String ID = "ID";
    public static final String PROF_NAME = "PROF_NAME";
    public static final String NODE_COUNT = "NODE_COUNT";
    public static final String NODES_STATUS = "NODES_STATUS";


    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
