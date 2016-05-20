package com.example.ghopkins.gcmsample;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

/**
 * Created by ghopkins on 5/20/2016.
 */
public class RegistrationService extends IntentService {

    public RegistrationService(){
        super("RegistrationService");
    }

    @Override
    protected void onHandleIntent(Intent intent){
        Log.i("called", "onhandledintent");
        InstanceID myID=InstanceID.getInstance(this);
        String registrationToken="Error";

        try {

             registrationToken = myID.getToken(
                    getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE,
                    null
            );

            Log.i("Reistration Token", registrationToken);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
