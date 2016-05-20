package com.example.ghopkins.gcmsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Intent i = new Intent(this, RegistrationService.class);
            startService(i);

    }

}
//    Server API Key h
//AIzaSyBdaVT1ePxc1VgH61TD0Xox8jo5-5Kcf7c
//        Sender ID:
//        751478596350