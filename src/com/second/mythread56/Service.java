package com.second.mythread56;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		while (isContinueRun == true) {
		}
		System.out.println("ͣ停下来了");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
