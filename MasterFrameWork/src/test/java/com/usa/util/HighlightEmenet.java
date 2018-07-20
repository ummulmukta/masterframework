package com.usa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightEmenet {

	public static void drawBorderRed(WebDriver driver, String xpath){
    WebElement element_node = driver.findElement(By.xpath(xpath));
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
    }
	public static void drawBorderGreen(WebDriver driver, WebElement webelement){
    WebElement element_node = webelement;
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].style.border='3px solid green'", element_node);
    }
	public static void drawBorderYellow(WebDriver driver, WebElement webelement){
    WebElement element_node = webelement;
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].style.border='3px solid yellow", element_node);
    }}




















/*Actions ac =new Actions(driver);
screenShot.captureScreenShot(driver, "Home Page");
driver.findElement(By.xpath(".//*[@id='checkInDate_display']")).click();
//ac.moveToElement(driver.findElement(By.xpath(".//*[@id='checkInDate_display']"))).click().build().perform();*/

//HighlightEmenet.drawBorder(driver, ".//*[@id='4_18_2018']");