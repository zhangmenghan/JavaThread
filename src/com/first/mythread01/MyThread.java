package com.first.mythread01;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
