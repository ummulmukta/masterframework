package com.usa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

        public class browserFactory {
	    public static String URL="https://disneyworld.disney.go.com/";
	    
	    public static WebDriver getBrowser(String browserName,WebDriver driver) throws InterruptedException{
		
		if(browserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", "./DriverBrowsers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
		if(browserName.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "./DriverBrowsers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")){
		System.setProperty("webdriver.gecko.driver","./DriverBrowsers/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("Microsoft")){
		System.setProperty("webdriver.edge.driver", "./DriverBrowsers/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    return driver;
	    }
        public static String getURL() {
		return URL; }}
        
     