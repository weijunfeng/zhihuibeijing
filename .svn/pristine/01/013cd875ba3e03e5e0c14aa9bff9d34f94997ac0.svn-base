package com.itheima.slidingmenudemo;

import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setBehindContentView(R.layout.left_menu);// 设置侧边栏布局

		SlidingMenu slidingMenu = getSlidingMenu();// 获取侧边栏对象
		slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);// 设置全屏触摸

		slidingMenu.setSecondaryMenu(R.layout.right_menu);// 设置右侧边栏
		slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);// 设置展现模式

		slidingMenu.setBehindOffset(100);// 设置预留屏幕的宽度
	}

}
