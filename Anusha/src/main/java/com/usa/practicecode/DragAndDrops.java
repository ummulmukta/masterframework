package com.usa.practicecode;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DragAndDrops {
	
    private static final boolean WebElement = false;


	// How to handle drag n drop
    //Ans:-I can handle drag n drop with the help of action class
	@Test(enabled=false) 
    public void Drag_Drop(){
    System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	Actions action =new Actions(driver);
    WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	action.dragAndDrop(drag, drop).build().perform();
	driver.quit();
    }
	
	
	//How to handle scroll down?
	//I can handle this many ways like with the help of action class and Java script executor.
	@Test(enabled=false)
	public void ScrollDownWithAction() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	Actions action =new Actions(driver);
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	action.sendKeys(Keys.PAGE_UP).build().perform();
	driver.quit();
    }
	
	
	
	@Test(enabled=false)
	public void ScrollDownWithJavascriptExecutor() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	driver.quit();
	}
	
	
	
	// If webelement not clickable then how you handle it?
	//I can handle this with the of action class.There is a many method like object.click and object.double click.
	@Test(enabled=false)
	public void ClickWebElementWithActionClass() {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	
	WebElement Icon=driver.findElement(By.xpath("//*[@class='gb_P' and contains(text(),'Gmail')]"));
	Actions action = new Actions(driver);
	action.click(Icon);
	action.perform();
	driver.quit();
	}
	
	
	
	@Test(enabled=false)
	public void ClickWebElementWithActionDoubleClick() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe"); 
	WebDriver driver=new ChromeDriver();
	driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	
	WebElement Icon = driver.findElement(By.xpath("//*[contains(text(),'Double-Click Me To See Alert')]"));
	Actions action = new Actions(driver);
	action.doubleClick(Icon);
	action.perform();
	Thread.sleep(3000);
	
	//How you handle pop up window or alert window?
	//WEll, there are many methods.I can handle this like driver.switchTo().alert().accept()method.;
	//Also there dismiss method and sendkeys method depends on requirements or scenario   
	String alert_message = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept(); 
	System.out.println(alert_message);
	driver.quit();
	}
	
	
	//How to handle drop down menu?
	//Ans. By select class.
	// How to count data from webelement and excel sheet  also how you print the whole data??
	//Ans;By collection class using list interface. 
	//Ans:For print all data I have to do looping.
	@Test (enabled=false)
	public void DropDownMemuByLooping() {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//This line for select only.
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'searchLanguage')]")));
		
		//This line for count the data.
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		//this looping for print all data.
		for(int i = 0; i<options.size(); i++) {
		System.out.println(options.get(i).getText());
		driver.quit();
		}}
	
	
	
	    //How to handle mouseHover
	    // By Action Class
		@Test (enabled=false)
		public void MouseHover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Hello. Sign in')]"));
		HighlightEmenet.drawBorder(driver, element);
		Thread.sleep(3000);
	    Actions action = new Actions(driver);
	    action.moveToElement(element).build().perform();
		
	    WebElement elements =  driver.findElement(By.xpath("//*[contains(text(),'Wedding Registry')]"));
	    HighlightEmenet.drawBorder(driver, elements);
		Thread.sleep(3000);
	    Actions ac = new Actions(driver);
	    ac.click(elements);
		ac.perform();
		driver.quit();
	    }
		
		//How to handle Iframe /how to switch Iframe to main window. 
	    //first i have to select the frame through driver.switchTo().frame()method then create again action class for mouse hover on corner then close the iframe.
		@Test (enabled=false)
		public void IframeHandle() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("naveenk");
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
	    Thread.sleep(5000);  
	    // first select the frame
	    driver.switchTo().frame("intercom-borderless-frame");
	    // then mouse hover on corner
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	    // Closes the fream
	    driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
	    // then Login button work as well
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	    Thread.sleep(5000);
	    driver.quit();
	    
        }
		
	    //How to handle the secured website like https or certificates?	
		//First i create the desired capability object then call the set capabilitry method.Then i write capability Type Inside the parameter then dot 
		//Accept ssl certificate then true.After that i call the browser .and inside the parameter i pass the capability object.Then call the Url of the website.
		//What is desired capabilities?
		//Desired capability is a class where i create the object.Through the object i pass the all capabilities,
		//like Selenium grid connectivity, Appium server connectivity and suchlab/browser steak connectivity/or cloud connectivity.
	    //Any server connetion  i have to use desired capabilities class.
	    @Test(enabled=false)
		public  void CertificatesHandle() {

		DesiredCapabilities cap = DesiredCapabilities.chrome();
       // Set ACCEPT_SSL_CERTS  variable to true
	    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
 
	     // Set the driver path
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	 
	    // Open browser with capability
	    WebDriver driver = new ChromeDriver(cap);
	    driver.get("http://www.softwaretestinghelp.com/qa-interview-questions/");
	    driver.manage().window().maximize();	
	    }
	
	    //How to handle calendar?
	    //First I have to find the location of calendar by driver. find element.After that i have to use List interface from java collection class
	    //n create object = driver.find elements to select the wholetable.Then i use the for loop and if else condition and break it whatever my
	    //requirement date.
	    
	    
	    @Test (enabled=false)
		public void HandleCalender() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker")).click();
		List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates){
		String date=ele.getText();
		
		if(date.equalsIgnoreCase("10")) {
		ele.click();
		break; }}
		Thread.sleep(3000);
		driver.quit();
		}
	    
	        //how to handle multiple window?
	    
	    //First i have to use the interface like list /set/hash map from java collection class.Then create the object=driver.get window handle method.
	    //Then i use driver.find elements to get the all windows xpath.Then again.// use interface like set /hashmap/list object= driver.get window handle.
	    //After that I have to use for loop .Inside the looping create variable:driver.get windowhandles method.Then driver.switch to().windows mrthod.
	    //Inside the parameter passing the object.Then driver.close to close the all child windows.
	    
	        @Test 
	  		public void multiplewindow() throws InterruptedException  {
	  		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  		
	  		 Set <String> handle=driver.getWindowHandles();
	  		 System.out.println(handle);
	  		 
	  		 driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
	  		
	  		 //This is generic defined interface.
	  		
	  		
	  		for(String windowhandle : driver.getWindowHandles()) {
	  			System.out.println(windowhandle);
	  			driver.switchTo().window(windowhandle);
	  			Thread.sleep(3000);
	  			}
	  		//Child window close.
	  		driver.close();
	  		//Parent window close
	  		driver.quit();
	  		}
	        
	        
	  		
	  		
	    }
	    
	
