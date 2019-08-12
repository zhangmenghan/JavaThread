package com.third.mythread03;

public class MyThread2 extends Thread {
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始      wait time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("结束      wait time=" + System.currentTimeMillis());
		}
	}
}
