package com.usa.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

        @CucumberOptions(
        		
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},

		features= {"Features/Test.feature"},
		
		glue= {"com.usa.stefdefination"},
				
		tags= {"@login"}
		)
        public class TestNgRunner extends AbstractTestNGCucumberTests{}


