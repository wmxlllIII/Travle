package com.zzy.travle.util;

import android.app.Application;

public class TravleApplication extends Application {
    private static TravleApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static TravleApplication getInstance() {
        return instance;
    }

}
