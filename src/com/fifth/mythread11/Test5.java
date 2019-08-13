package com.fifth.mythread11;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test5 {

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
		Calendar calendarRef = Calendar.getInstance();
		Date runDate = calendarRef.getTime();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(myTask, runDate, 3000);
	}
}
