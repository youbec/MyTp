package com.ghxa.devmvp;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;


public class DevMvpApplication extends Application {
    private static DevMvpApplication app;

    public static Context getAppContext() {
        return app;
    }

    public static Resources getAppResources() {
        return app.getResources();
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

    }
}
