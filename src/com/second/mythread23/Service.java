package com.second.mythread23;

public class Service {

	private String usernameParam;
	private String passwordParam;
	private String anyString = new String();
	public void setUsernamePassword(String username, String password) {
		try {
			// 锁的是anyString对象,线程A和线程B在执行此代码块的时候并不会顺序执行，而是异步执行
			// 对象监视器是同一个anyString，所以结果会显示同步执行
			synchronized (anyString) {
				System.out.println("线程名为:" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名为:" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
