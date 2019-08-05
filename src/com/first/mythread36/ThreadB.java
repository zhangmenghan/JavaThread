package com.first.mythread36;

public class ThreadB extends Thread {

	private int count = 0;

	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		while (true) {
			count++;
		}
	}

}
