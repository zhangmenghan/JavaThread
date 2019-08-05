package com.first.mythread08;

public class BLogin extends Thread{
	
	@Override
	synchronized public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}
	
}
