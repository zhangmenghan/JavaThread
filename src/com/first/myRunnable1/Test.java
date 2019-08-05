package com.first.myRunnable1;

public class Test {
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束");
	}
}
