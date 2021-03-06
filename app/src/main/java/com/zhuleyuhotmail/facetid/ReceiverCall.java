package com.zhuleyuhotmail.facetid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiverCall extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("Action: " + intent.getAction() + "\n");
        sb.append("URI: " + intent.toUri(Intent.URI_INTENT_SCHEME).toString() + "\n");
        String log = sb.toString();
        Log.i("ReceiverCall", log);
        Log.i("Service Stops", "Ohhhhhhh");
        Intent serviceIntent = new Intent(context, MyService.class);
        serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startService(serviceIntent);
    }

}

