package jp.mixi.practice.intent.med;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {
	
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.v("ACTION",intent.getAction());
	}

}
