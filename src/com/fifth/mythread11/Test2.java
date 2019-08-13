package com.fifth.mythread11;

import java.util.Timer;
import java.util.TimerTask;

public class Test2 {

	static public class MyTask extends TimerTask{
		@Override
		public void run() {
			try {
				System.out.println("begin temer=" + System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("end temer=" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		System.out.println("当前时间：" + System.currentTimeMillis());
		Timer timer = new Timer();
		timer.schedule(myTask, 3000, 4000);
	}
}
