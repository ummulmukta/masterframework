package com.usa.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static String CaptureScreenShot(WebDriver driver,String ScreenShotName) throws Exception  {
		
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String currentDir=System.getProperty("user.dir");
	DateFormat dateformat = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
	Date date = new Date();
	String dateTime=dateformat.format(date.getTime());
    String destination= currentDir+"//ScreenShot//"+dateTime+"//"+ScreenShotName+".png";
	FileUtils.copyFile(source,new File(destination));
	System.out.println("ScreenShotTaken");
	
	
	
	
	
		return destination;
		
		
	}

}
