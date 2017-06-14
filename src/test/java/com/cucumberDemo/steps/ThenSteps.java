package com.cucumberDemo.steps;

import com.cucumberDemo.actions.AssertionActions;
import com.cucumberDemo.pageobjects.AbstractPageObject;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class ThenSteps {

	@Then(value = "^then he will see the mail view$")
	public void access_to_the_url() throws Throwable {
		AssertionActions.checkIfMailBoxIsVisible();
	}
	@After
	public static void quitDriver(){
		AbstractPageObject.driver.close();
	}
}
