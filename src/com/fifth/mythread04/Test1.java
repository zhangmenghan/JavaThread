package com.fifth.mythread04;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("当前时间为：" + new Date());
		
		Calendar calendarRef = Calendar.getInstance();
		calendarRef.add(Calendar.SECOND, 10);
		Date runDate = calendarRef.getTime();
		System.out.println("计划时间为：" + runDate);
		MyTask myTask = new MyTask();
		Timer timer = new Timer();
		timer.schedule(myTask, runDate, 4000);
	}
	
}
