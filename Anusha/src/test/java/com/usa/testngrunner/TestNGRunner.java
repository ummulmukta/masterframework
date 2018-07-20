package com.usa.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "Features/Cucumber.feature",
		glue = "com.usa.stepdefinition",
		tags = "@hera")
		
		public class TestNGRunner extends AbstractTestNGCucumberTests {

}
