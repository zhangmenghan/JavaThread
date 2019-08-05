package com.first.mythread07;

public class ALogin extends Thread{
	
	@Override
	synchronized public void run() {
		super.run();
		LoginServlet.doPost("a", "aa");
	}
	
}
