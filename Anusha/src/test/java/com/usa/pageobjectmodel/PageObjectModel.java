package com.usa.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	
	WebDriver driver;
	public  PageObjectModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		


	@FindBy(how = How.XPATH, using = "//a[@class='signIn']")
@CacheLookup
private WebElement SigninButton ;
public WebElement SigninButton () {
return SigninButton;
}


@FindBy( xpath = "//input[@name='username']" )
@CacheLookup
private WebElement UserName;
public WebElement  UserName() {
return  UserName;
}


@FindBy( xpath = "//input[@name='password']" )
@CacheLookup
private WebElement Password;
public WebElement Password() {
return Password;
}	

@FindBy( xpath = "//span[@class='buttonText'][1]" )
@CacheLookup
private WebElement ClickSignin;
public WebElement ClickSignin() {
return ClickSignin;
}
}
