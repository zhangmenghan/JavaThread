package com.mythread11.first;

public class MyThread extends Thread{
	
	public MyThread() {
		System.out.println("构造方法打印为：" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run方法的打印" + Thread.currentThread().getName());
	}
}
