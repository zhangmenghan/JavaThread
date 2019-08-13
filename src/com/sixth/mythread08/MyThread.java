package com.sixth.mythread08;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
