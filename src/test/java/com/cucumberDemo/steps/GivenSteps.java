package com.cucumberDemo.steps;

import com.cucumberDemo.actions.AccessActions;

import cucumber.api.java.en.Given;



public class GivenSteps{
	
	@Given(value = "^a valid user$")
	public void access_to_the_url() throws Throwable {
		AccessActions.accessToGmail();
	}

}
