package com.third.mythread36;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadA线程中取值ֵ=" + Tools.tl.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
