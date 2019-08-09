package com.second.mythread32;

public class ThreadA extends Thread {
	@Override
	public void run() {
		Service.printA();
	}

}
