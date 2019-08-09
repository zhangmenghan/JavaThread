package com.second.mythread46;

public class ThreadB extends Thread {

	private Service service;
	private Userinfo userinfo;

	public ThreadB(Service service, 
			Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}

}
