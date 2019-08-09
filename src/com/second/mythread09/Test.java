package com.second.mythread09;

public class Test {

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
