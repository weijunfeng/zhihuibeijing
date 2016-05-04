package com.itheima.screenadapterdrawable;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 获取设备密度, 和分辨率有关
		float density = getResources().getDisplayMetrics().density;
		System.out.println("设备密度:" + density);
	}

}
