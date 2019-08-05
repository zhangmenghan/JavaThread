package com.mythread01.first;

import com.mythread01.first.MyThread;

public class Test {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		System.out.println("运行结束");
	}
}
