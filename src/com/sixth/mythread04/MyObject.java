package com.sixth.mythread04;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}
	synchronized public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
