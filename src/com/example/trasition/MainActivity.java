package com.example.trasition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Button nextActivity = (Button) findViewById(R.id.nextActivity);
		 nextActivity.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		  case R.id.nextActivity:
		   Intent nextActivity = new Intent(this,NextActivity.class);
		   startActivity(nextActivity);
		   //push from bottom to top
		  // overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
		   //slide from right to left
		   overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
		   break;

		   // More buttons go here (if any) ...

		  }
	}
}
