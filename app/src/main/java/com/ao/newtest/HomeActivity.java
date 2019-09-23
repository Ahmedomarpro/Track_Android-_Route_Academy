package com.ao.newtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.newtest.XO_App.Main2Activity;
import com.ao.newtest.XO_App.XOX_Class;
import com.ao.newtest.course.Android_course;
import com.ao.newtest.course.Full_stack_course;
import com.ao.newtest.course.Ios_course;

public class HomeActivity extends AppCompatActivity {

	private Button mButton;
	private Button mButton2;
	private Button mButton9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);


		mButton = findViewById(R.id.button);
		mButton2 = findViewById(R.id.button2);
		mButton9 = findViewById(R.id.button9);


		view();

	}

	public void view (){


		mButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//Intent intent = new Intent(HomeActivity.this, Android_course.class);
				//startActivity(intent);

				Intent intent = new Intent(HomeActivity.this, XOX_Class 						.class);
				startActivity(intent);
			}
		});
		mButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(HomeActivity.this, login.class);
				startActivity(intent);

			}
		});

		mButton9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(HomeActivity.this, Full_stack_course.class);
				startActivity(intent);

			}
		});

	}


}
