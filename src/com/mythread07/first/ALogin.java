package com.mythread07.first;

public class ALogin extends Thread{
	
	@Override
	synchronized public void run() {
		super.run();
		LoginServlet.doPost("a", "aa");
	}
	
}
