package com.cucumberDemo.actions;


import com.cucumberDemo.pageobjects.GmailPageObject;

public class AccessActions{

	public static void accessToGmail(){
		
		GmailPageObject.getPage();

	}

	public static void doLoginInGmail(String user, String password) {
		GmailPageObject.doLogin(user, password);
	}
}
