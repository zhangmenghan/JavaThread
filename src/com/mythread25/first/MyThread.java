package com.mythread25.first;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch()方法");
			e.printStackTrace();
		}
	}
}
