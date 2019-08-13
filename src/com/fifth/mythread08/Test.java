package com.fifth.mythread08;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		Calendar calendarRef1 = Calendar.getInstance();
		Date runDate1 = calendarRef1.getTime();
		
		while(true) {
			i++;
			Timer timer = new Timer();
			MyTaskA myTaskA = new MyTaskA(i);
			timer.schedule(myTaskA, runDate1);
			timer.cancel();
		}
	}
}
