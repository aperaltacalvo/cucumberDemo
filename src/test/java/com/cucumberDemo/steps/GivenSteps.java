package com.cucumberDemo.steps;

import com.cucumberDemo.actions.AccessActions;

import cucumber.api.java.en.Given;



public class GivenSteps{
	
	@Given(value = "^access to the url \"([^\"]*)\"$")
	public void access_to_the_url(String url) throws Throwable {
		AccessActions.getPage(url);
	}

}
