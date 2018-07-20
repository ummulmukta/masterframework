package com.usa.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.usa.pageobjectmodel.PageObjectModel;
import com.usa.utility.BrowserFactory;
import com.usa.utility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	PageObjectModel PF;
	WebDriver driver;
	
	
	
	
	@Given("^User want to visit homepage$")
	public void user_want_to_visit_homepage() throws Throwable {
		
		driver = BrowserFactory.getbrowser("chrome", driver);
		driver.get(BrowserFactory.getURL());
       
	PF=PageFactory.initElements(driver, PageObjectModel.class);
		
	  
	}

	@When("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
	   PF.SigninButton().click();
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		
	   PF.UserName().sendKeys("ummulmukta@gmail.com"); 
	   PF.Password().sendKeys("Mukta1978");
	}

	@When("^User able to click signin button$")
	public void user_able_to_click_signin_button() throws Throwable {
	PF.ClickSignin().click();
	
	}

	@Then("^User successfully login and verify$")
	public void user_successfully_login_and_verify() throws Throwable {
	  
	}



}
