package com.seventh.mythread03;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}

}
