package com.fifth.mythread07;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{

	@Override
	public void run() {
		System.out.println("A run timer=" + new Date());
	}

}
