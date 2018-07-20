package com.usa.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListInterface {
	WebDriver driver;
	
	
   @Test
  public void looping() throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","/DriverBrowsers/chromedriver.exe.");
	  
		driver=new ChromeDriver();
		driver.get("https://disneyworld.disney.go.com/resorts/");
		List<WebElement>AllHotel=driver.findElements(By.xpath("//a[contains(@href,'') and @class=' cardLinkOverlay lowOverlay']"));
		System.out.println(AllHotel.size()+ "TotalHotel");
		for(int i=0;i<AllHotel.size();i++) {
		if(i>1) {
		Thread.sleep(2000);
		System.out.println("Selected"+i+"hotel::"+AllHotel.get(i).getAttribute("text")+"Test Passed");
		AllHotel.get(i).click();
		break;
		
		
		}
	
   }
   }}
