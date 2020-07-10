package com.wellee.factory;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

public class SpManager {

    private volatile static SpManager INSTANCE;
    private SharedPreferences mSp;
    private SharedPreferences.Editor mEdit;

    private SpManager() {

    }

    public static SpManager getInstance() {
        if (INSTANCE == null) {
            synchronized (SpManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SpManager();
                }
            }
        }
        return INSTANCE;
    }

    public void init(@NonNull Context context) {
        mSp = context.getApplicationContext().getSharedPreferences("cache", Context.MODE_PRIVATE);
        mEdit = mSp.edit();
    }

    public SpManager save(String key, String value) {
        if (mSp == null) throw new NullPointerException("先调用init()");
        mEdit.putString(key, value);
        return this;
    }

    public String getString(String key, String defaultValue) {
        if (mSp == null) throw new NullPointerException("先调用init()");
        return mSp.getString(key, defaultValue);
    }

    public void commit() {
        if (mSp == null) throw new NullPointerException("先调用init()");
        mEdit.commit();
    }

}
