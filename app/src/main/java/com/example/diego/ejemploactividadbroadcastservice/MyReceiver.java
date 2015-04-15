package com.example.diego.ejemploactividadbroadcastservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by Diego on 15/04/2015.
 */
public class MyReceiver extends BroadcastReceiver{
    private TextView t, t2;

    public MyReceiver(TextView t,TextView t2) {
        this.t=t;
        this.t2=t2;
        t. setText ("nada ");
        t2. setText ("nada");
    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
