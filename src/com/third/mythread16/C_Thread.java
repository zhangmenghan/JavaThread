package com.third.mythread16;

public class C_Thread extends Thread {

	private C r;

	public C_Thread(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
