package com.maricia.googlefit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.result.DailyTotalResult;

public class MainActivity extends Activity  {

    private GoogleApiClient mClient = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToSensorActivity(View v)
    {
        Intent mIntent = new Intent(this, SensorActivity.class);
        startActivity(mIntent);
    }

    public void navigateToHistoryActivity(View v)
    {
        Intent mIntent = new Intent(this, HistoryActivity.class);
        startActivity(mIntent);
    }

    public void navigateToSubscriptionActivity(View v)
    {
        Intent mIntent = new Intent(this, SubscriptionActivity.class);
        startActivity(mIntent);
    }

}
