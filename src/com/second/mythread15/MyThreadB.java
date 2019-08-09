package com.second.mythread15;

public class MyThreadB extends Thread {

	private Sub sub;

	public MyThreadB(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}
}
