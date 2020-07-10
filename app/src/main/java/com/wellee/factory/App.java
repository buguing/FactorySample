package com.wellee.factory;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SpManager.getInstance().init(this);
    }
}
