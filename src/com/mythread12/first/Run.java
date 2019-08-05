package com.mythread12.first;

public class Run {
	public static void main(String[] args) {
		CountOperate countOperate = new CountOperate();
		Thread t1 = new Thread(countOperate);
		t1.setName("A");
		t1.start();
	}
}
