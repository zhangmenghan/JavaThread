package com.third.mythread08;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
		}
	}

}
