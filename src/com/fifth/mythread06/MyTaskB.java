package com.fifth.mythread06;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask{

	@Override
	public void run() {
		System.out.println("B run timer=" + new Date());
	}

}
