package com.women_period_cycle.women_period_cycle_files;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class MyApplication extends Application {
    private GoogleAnalytics analytics;
    private Tracker tracker;

    @Override public void onCreate() {
        super.onCreate();
        try {

                    analytics = GoogleAnalytics.getInstance(this);
        }
        catch(Exception e){
            analytics = GoogleAnalytics.getInstance(this);


        }
        tracker = analytics.newTracker("UA-58768853-20");
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
