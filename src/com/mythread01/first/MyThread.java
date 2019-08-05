package com.mythread01.first;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
