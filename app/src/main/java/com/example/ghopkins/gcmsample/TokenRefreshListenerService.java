package com.example.ghopkins.gcmsample;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by ghopkins on 5/20/2016.
 */
public class TokenRefreshListenerService extends InstanceIDListenerService{

    @Override
    public void onTokenRefresh() {
        Intent i = new Intent(this, RegistrationService.class);
        startService(i);
    }
}
