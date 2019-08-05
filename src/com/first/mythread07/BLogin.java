package com.first.mythread07;

public class BLogin extends Thread{
	
	@Override
	synchronized public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}
	
}
