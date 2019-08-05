package com.first.mythread01;

import com.first.mythread01.MyThread;

public class Test {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		System.out.println("运行结束");
	}
}
