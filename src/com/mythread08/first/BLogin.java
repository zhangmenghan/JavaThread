package com.mythread08.first;

public class BLogin extends Thread{
	
	@Override
	synchronized public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}
	
}
