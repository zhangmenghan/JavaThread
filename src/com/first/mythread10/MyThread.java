package com.first.mythread10;

public class MyThread extends Thread{
	
	private int i = 5;
	
	@Override
	synchronized public void run() {
		super.run();
		System.out.println("i=" + (i--) + "  ThreadName" + Thread.currentThread().getName());
	}
	
}
