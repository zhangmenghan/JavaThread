package com.first.mythread08;

public class LoginServlet {
	
	private static String usernameRef;
	private static String passwordRef;
	
	synchronized public static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if(username.equals("a")) {
				Thread.sleep(1000);
			}
			passwordRef = password;
			System.out.println("username=" + usernameRef + "  password=" + passwordRef);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
