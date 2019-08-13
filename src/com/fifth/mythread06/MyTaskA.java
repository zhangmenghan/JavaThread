package com.fifth.mythread06;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{

	@Override
	public void run() {
		System.out.println("A run timer=" + new Date());
		this.cancel();
		System.out.println("A任务移除自己");
	}

}
