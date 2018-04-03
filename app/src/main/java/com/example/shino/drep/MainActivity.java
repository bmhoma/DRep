package com.example.shino.drep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "5b2cde22-a230-4355-a381-5f8cb68c2fe9", Analytics.class, Crashes.class);
        Analytics.trackEvent( "name": "hello there my brudah");
    }
}
