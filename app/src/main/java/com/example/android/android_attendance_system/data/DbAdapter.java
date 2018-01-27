package com.example.android.android_attendance_system.data;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by LOKESH on 24-01-2018.
 */

public class DbAdapter extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "contactsManager.db";
    private static final int DATABASE_VERSION = 1;

    public DbAdapter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
