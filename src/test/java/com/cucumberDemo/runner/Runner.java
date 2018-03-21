package com.cucumberDemo.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = "@login", glue="com.cucumberDemo.steps", format = {"pretty", "html:target/Destination"}  )

public class Runner {


}
