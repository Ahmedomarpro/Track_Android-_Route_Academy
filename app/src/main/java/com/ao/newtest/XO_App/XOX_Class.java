package com.ao.newtest.XO_App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ao.newtest.R;

public class XOX_Class extends AppCompatActivity {

	TextView btnTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xox__class);
		btnTxt = findViewById(R.id.textView21);


 	}

	public void viewXo(View view){
		ImageButton  myBtn  =  (ImageButton) view;

		//btnTxt.setText(btn1.getText().toString());


		Toast.makeText(this, "welcome welcome", Toast.LENGTH_SHORT).show();

	}

	public void btnView(View view){

		 Button btn1 = (Button) view;

		 btnTxt.setText(btn1.getText().toString());

			Toast.makeText(this, "welcome welcome", Toast.LENGTH_SHORT).show();

	}
}
