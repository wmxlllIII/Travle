package com.zzy.travle.util;

import android.app.Application;
import android.content.Context;

public class TravleApplication extends Application {
    private static TravleApplication instance;
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mContext = getApplicationContext();
    }

    public static TravleApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return mContext;
    }

}
