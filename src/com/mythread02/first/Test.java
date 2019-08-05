package com.mythread02.first;

public class Test {
	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.setName("MyThread");
			myThread.start();
			for(int i = 0;i<10;i++) {
				int time = (int)(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println(Thread.currentThread().getName());
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
