package com.cucumberDemo.steps;

import com.cucumberDemo.actions.AccessActions;

import cucumber.api.java.en.When;

public class WhenSteps {

	
	@When(value = "^when he clicks on submit button with user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void access_to_the_url(String user, String password) throws Throwable {
		AccessActions.doLoginInGmail(user,password);
	}
}
