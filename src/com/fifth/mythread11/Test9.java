package com.fifth.mythread11;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test9 {

	static public class MyTask extends TimerTask{
		public void run() {
			System.out.println("begin temer=" + System.currentTimeMillis());
			System.out.println("end temer=" + System.currentTimeMillis());
		}
	}
	
	public static void main(String[] args) {
		MyTask myTask = new MyTask();
		System.out.println("现在执行时间：" + new Date());
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
		Date runDate = calendarRef.getTime();
		System.out.println("计划执行时间" + runDate);
		Timer timer = new Timer();
		timer.schedule(myTask, runDate, 2000);
	}
}
