package com.raaga.kolte.java;

import java.util.ResourceBundle;

public class MyApp {

	public int userLogin(String user, String pwd) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String password = rb.getString("password");
		
		if(user.equals(userName) && pwd.equals(password))
			return 1;
		else
			return 0;
		}
}