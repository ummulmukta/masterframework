package com.usa.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	private static String URL = "https://disneyworld.disney.go.com/";
	public static WebDriver getbrowser(String browsername,WebDriver driver) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Browser/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
			
		else if(browsername.equalsIgnoreCase("ie"))	{
			System.setProperty("webdriver.ie.driver", "./Browser/MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	public static String getURL() {
		return URL;
		
	}

}
