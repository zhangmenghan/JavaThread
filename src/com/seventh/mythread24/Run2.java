package com.seventh.mythread24;

public class Run2 {

	public static void main(String[] args) {
		try {
			SelfRun autoRun = new SelfRun();
			autoRun.run();
			Thread.sleep(5000);
			autoRun.stopRun();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
