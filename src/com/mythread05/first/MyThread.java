package com.mythread05.first;

public class MyThread extends Thread{
	
	private int count = 5;
	
	@Override
	public void run() {
		super.run();
		count--;
		System.out.println("由" + Thread.currentThread().getName() + "计算.count=" + count);
	}
	
}
