package com.richitec.mystery;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.richitec.commontoolkit.activityextension.AppLaunchActivity;
import com.richitec.mystery.assistant.AboutActivity;

public class MysteryAppLaunchActivity extends AppLaunchActivity {

	@Override
	public Drawable splashImg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Intent intentActivity() {
		// go to mystery about activity
		return new Intent(this, AboutActivity.class);
	}

	@Override
	public void didFinishLaunching() {
		try {
			// sleep 5 seconds
			Log.d("@", "I'm sleeping...");

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
