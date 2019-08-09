package com.second.mythread32;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}
}
