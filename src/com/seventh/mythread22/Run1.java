package com.seventh.mythread22;

public class Run1 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// 对象
		// smyThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		MyThread
				.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}
}
