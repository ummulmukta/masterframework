package com.usa.ttech.mukta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


   public class ValidateMethod {
	   
	   @Test( priority = 2)
       public void HomePageValidation() throws Exception {
		System.setProperty("webdriver.ie.driver", "./DriverBrowsers/chromedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://disneyworld.disney.go.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
        String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		if (pagetitle.contains("Walt Disney World")) {
		System.out.println("Validation Disney Home Page");
		screenShot.captureScreenShot(driver, "Disney Home Page");
		}
		else {
		System.out.println("Somthing Wrong");
		screenShot.captureScreenShot(driver, "Disney Home Page");
		}
		driver.quit();
       }
       
    @Test ( priority = 1)
     public void LoginValidationpage() throws Exception {
		System.setProperty("webdriver.ie.driver", "./DriverBrowsers/chromedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://disneyworld.disney.go.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(text(),'Sign In or Create Account')]")).click();
		
        String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		if (pagetitle.contains("signInHeaderImage")) {
		System.out.println("Validation Disney login Page");
		screenShot.captureScreenShot(driver, "Disney login Page");
		}
		else {
		System.out.println("Somthing Wrong");
		screenShot.captureScreenShot(driver, "Disney login Page");
		}
		driver.quit();
       }
	
	
}