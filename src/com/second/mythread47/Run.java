package com.second.mythread47;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止他 stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
