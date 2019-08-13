package com.fifth.mythread03;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{

	@Override
	public void run() {
		try {
			System.out.println("A begin timer=" + new Date());
			Thread.sleep(20000);
			System.out.println("A end timer=" + new Date());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
