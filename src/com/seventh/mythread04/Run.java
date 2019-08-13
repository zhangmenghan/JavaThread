package com.seventh.mythread04;

public class Run {

	// NEW,
	// RUNNABLE,
	// TERMINATED,
	// BLOCKED,
	// WAITING,
	// TIMED_WAITING,

	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main方法中的t状态：" + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
