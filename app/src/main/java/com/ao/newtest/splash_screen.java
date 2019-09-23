package com.ao.newtest;

 import android.annotation.SuppressLint;
 import android.content.Intent;
 import android.os.Bundle;
 import android.os.Handler;
 import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class splash_screen extends AppCompatActivity {

	private ImageView mSplash;
	Animation anim;

	private static final long SPLASH_DISPLAY_LENGTH = 4000;



 	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);


		mSplash = findViewById(R.id.splash);
		anim  = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashview);
		mSplash.startAnimation(anim);

			new Handler().postDelayed(new Runnable(){
			@Override
			public void run() {

				Intent mainIntent = new Intent(splash_screen.this,HomeActivity.class);
				 startActivity(mainIntent);
				splash_screen.this.finish();

			}
		}, SPLASH_DISPLAY_LENGTH);

	}

	}


