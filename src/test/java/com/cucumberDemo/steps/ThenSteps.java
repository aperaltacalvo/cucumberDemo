package com.cucumberDemo.steps;

import com.cucumberDemo.actions.AssertionActions;
import com.cucumberDemo.pageobjects.AbstractPageObject;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class ThenSteps {

	@Then(value = "^the mailbox main page is shown$")
	public void access_to_the_url() throws Throwable {
		AssertionActions.checkIfMailBoxIsVisible();
	}
	@After
	public static void quitDriver(){
		AbstractPageObject.driver.close();
	}
}
