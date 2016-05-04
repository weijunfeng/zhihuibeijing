package com.itheima.screenadapterdrawable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		int width = getWindowManager().getDefaultDisplay().getWidth();
		int height = getWindowManager().getDefaultDisplay().getHeight();

		TextView tv1 = (TextView) findViewById(R.id.tv_1);
		TextView tv2 = (TextView) findViewById(R.id.tv_2);

		LayoutParams params = new LayoutParams(width / 3, (int) (height * 0.2));

		tv1.setLayoutParams(params);
		tv2.setLayoutParams(params);
	}

}
