package com.usa.pageobjectmodel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.usa.util.screenShot;

public class Disneyworld_Class {

public void Test() throws Throwable {
System.setProperty ("webdriver.chrome.driver","./DriverBrowsers/chromedriver.exe" );
WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();
driver.get("https://disneyworld.disney.go.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// Click the Date
driver.findElement(By.xpath(".//*[@id='checkInDate_display']")).click();


// Set the  First Date
driver.findElement(By.xpath("//*[@id='5_16_2018']/div/span")).click();
Thread.sleep(3000);
// set the Second Date
driver.findElement(By.xpath("//*[@id='5_17_2018']/div/span")).click();


// Select Adult 2
driver.findElement(By.xpath(".//*[@id='qqForm_adultCount']/button[1]")).click();
driver.findElement(By.xpath(".//*[@id='qqForm_adultCount']/button[2]")).click();


// Select the first Child and age
driver.findElement(By.xpath("//*[@id='qqForm_childCount']/button[2]/span/wdpr-icon/span")).click();
driver.findElement(By.xpath("//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/button/span[2]")).click();
driver.findElement(By.xpath("//*[@id='partyMixSelectChildAge1']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[7]/a/div")).click();

// Select the Second Child and age
driver.findElement(By.xpath("//*[@id='qqForm_childCount']/button[2]/span/wdpr-icon/span")).click();
driver.findElement(By.xpath("//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/button/span[2]")).click();
driver.findElement(By.xpath("//*[@id='partyMixSelectChildAge2']/div/div/wdpr-uiplus-select-box/ol/div/ul/li[14]/a/div/span")).click();

// Select the all resort Hotel
driver.findElement(By.xpath(".//*[@id='selectDestination']/ol/button")).click();
driver.findElement(By.xpath("//*[@id='selectDestination']/ol/div/ul/li[1]/a/div/span")).click();

// Click find resort button
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='findPricesButton']")).click();



// this List Interface and Looping for find Hotel
List<WebElement> AllHotel= driver.findElements(By.xpath("//a[contains(@href,'') and @class=' cardLinkOverlay lowOverlay']"));
System.out.println(AllHotel.size()+ "<<<<<<<<total hotel");
for(int i=0;i<AllHotel.size();i++) {
if(i>1) {
Thread.sleep(2000);
System.out.println("Selected "+i+" hotel::"+ AllHotel.get(i).getAttribute("text")+"<<<<Test Passed>>>>");
AllHotel.get(i).click();
break; }}
Thread.sleep(2500);
System.out.println("<<<<<<<Searching unavailable room>>>>>>>>");


// This condition for find the unavailable room
if(driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size()>0) {
System.out.println("Unavailable room number =" + driver.findElements(By.xpath(".//*[@class='priceUnavailable unavailable']")).size());
screenShot.captureScreenShot(driver, "unavailable room"); }
else {
System.out.println(">>>>>>>>>>No unavailable room<<<<<<<<<<< ");
}

// this List Interface and Looping for find room
List<WebElement> AllRoom= driver.findElements(By.xpath(".//span[text()='Select']"));
System.out.println(AllRoom.size()+ "<<<<<<<<Total Available Room<<<<<<<<<<");
for(int i=0;i<AllRoom.size();i++) {
if(AllRoom.size()>0) {
Thread.sleep(3000);
System.out.println(driver.findElement(By.xpath(".//*[@class='roomsDetails']/ul/li/div[2]/h3")).getText()+ "<<<<< Selected available Room && Room Type");
AllRoom.get(i).click();
break;   }}
Thread.sleep(2000);
System.out.println(">>>>>>>>>>Congratulations finding room<<<<<<<<<<< ");

//Upgrade ticket
driver.findElement(By.xpath(".//*[@id='packageTicketNumberOfDaysid-base']/div/span[2]/div")).click();

Thread.sleep(2000);

//Update Park Hopper
driver.findElement(By.xpath(".//*[@id='packageTicketOptionsid-base']/div/span[2]/div")).click();

// Click ContinueButton
driver.findElement(By.xpath("//*[@id=\"continueButton\"]")).click();

Thread.sleep(2000);

// Click ContinueButton
driver.findElement(By.xpath("//*[@id=\"continueButton\"]")).click();

// Click Ground Transportation
driver.findElement(By.xpath(".//span[text()='Add Ground']")).click();

// Click Next button
driver.findElement(By.xpath(".//*[@id='doneButton']")).click();

Thread.sleep(2000);
// Click Done button
driver.findElement(By.xpath(".//*[@id='doneButton']")).click();

// Verify Complimentary

System.out.println(driver.findElement(By.xpath("//*[@id=\"vacationOfferContainer\"]/table/tbody/tr[8]/td[3]/span")).getText()+">>>>>>>>Complimentary<<<<<<<<");

// System.out.println(">>>>>>>>Complimentary<<<<<<<<");

// Take Screen Short
screenShot.captureScreenShot(driver,"Ground Transportation line\r\n" + "Take a screenshot");
System.out.println(">>>>>>>>>Take Screenshort Ground Transportation<<<<<<<<<");

// Remove cart Click
driver.findElement(By.xpath("//*[@id=\"openDialogvacationoffer\"]/div")).click();

// Finally Remove cart
driver.findElement(By.xpath("//*[@id=\"removeButtonvacationoffer\"]/span/span")).click();
Thread.sleep(2000);



// Take Screen Short

screenShot.captureScreenShot(driver,"Empty Cart\r\n" + "Take a screenshot");
System.out.println(">>>>>>>>>TakeScreen short Empty cart<<<<<<<<<");
Thread.sleep(3000);

System.out.println(">>>>>>>>>>>>>Congratulations Alam your Test Case Pass<<<<<<<<<<<<<<");
driver.quit();
}}
