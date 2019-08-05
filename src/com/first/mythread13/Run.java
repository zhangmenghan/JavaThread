package com.first.mythread13;

public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		System.out.println("begin ==" + mythread.isAlive());
		mythread.start();
		System.out.println("end ==" + mythread.isAlive());
	}
}
