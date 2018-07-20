package com.usa.stefdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import com.usa.pageobjectmodel.PageObjectClass;
import com.usa.util.ListenerTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
     
    @Listeners(ListenerTest.class) 
    public class StefDefination  {
    PageObjectClass PF	;
    WebDriver driver;
    
	@Given("^User visit on homepage$")
	public void user_visit_on_homepage() throws Throwable {
		
	driver = com.usa.util.browserFactory.getBrowser("chrome", driver);
    driver.get(com.usa.util.browserFactory.URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    PF =PageFactory.initElements(driver, PageObjectClass.class);
    }
	@When("^User able to picks a dates$")
	public void user_able_to_picks_a_date() throws Throwable {
	PF.SelectDateButton().click();
	PF.SelectFirstDate().click();
	Thread.sleep(2000);
	PF.SelectSecondDate().click();
    }
	@When("^User picks two adults$")
	public void user_picks_two_adults() throws Throwable {
    PF.SelectFirstAdult().click();
    PF.SelectSecondAdult().click();
	}
    @When("^User picks one child and select age Twelve$")
	public void user_picks_one_child_and_select_age_Twelve() throws Throwable {
   PF.SelectFirstChild().click();
   PF.SelectDrup().click();
PF.SelectFirstChildAge().click();
	}
    @When("^User picks another child and select age Five$")
	public void user_picks_another_child_and_select_age_Five() throws Throwable {
PF.SelectSecondChild().click();
PF.SelectDrup2().click();
PF.SelectSecondChildAge().click();
	}
    @When("^User select All Resort Hotels button$")
	public void user_select_All_Resort_Hotels_button() throws Throwable {
	
	PF.SelectAllResortHotels().click();
	PF.SelectAllresortButton().click();
	}
    @When("^User clicks Find Resort$")
	public void user_clicks_Find_Resort() throws Throwable {
PF.SelectFindResort().click();

	
	}
    @Then("^User should see various resort options selects any available room in the resort and clicks select buttun$")
	public void user_should_see_various_resort_options() throws Throwable {
		
	
	}
    @When("^User able to see all unavailable Room$")
	public void user_able_to_see_all_unavailable_Room() throws Throwable {
		

	}
    @When("^user able to click available room$")
	public void user_able_to_click_available_room() throws Throwable {
	
	
	}

	@When("^User selects any ticket option$")
	public void user_selects_any_ticket_option_other_than_what_is_selected() throws Throwable {


	}

	@When("^User clicks Park Hopper Option$")
	public void user_clicks_Park_Hopper_Option() throws Throwable {

	}

	@When("^User clicks continue$")
	public void user_clicks_continue() throws Throwable {
		

	}

	@Then("^User should see dining plan options and selects no dining plan and clicks continue$")
	public void user_should_see_dining_plan_options_and_selects_no_dining_plan_and_clicks_continue() throws Throwable {
	
	}
 
	
	@When("^User clicks Add Ground for Ground transportation$")
	public void user_clicks_Add_Ground_for_Ground_transportation() throws Throwable {
		
	}

	@When("^User clicks Next$")
	public void user_clicks_Next() throws Throwable {

	}
    @When("^User clicks Done$")
	public void user_clicks_Done() throws Throwable {

	}
	@When("^User sees Complimentary on Ground transportation option$")
	public void user_sees_Complimentary_on_Ground_transportation_option() throws Throwable {

	}
    @Then("^Screenshot of the cart page$")
	public void screenshot_of_the_cart_page() throws Throwable {

	}
    @When("^User remove all items from the cart$")
	public void user_remove_all_items_from_the_cart() throws Throwable {
	
	}
    @When("^Another Screenshot$")
	public void another_Screenshot() throws Throwable {
    }	
    	
    @Then("^Usre success fully verify$")
    public void usre_success_fully_verify() throws Throwable {	
    	
   
    	    String titlestatus = driver.findElement(By.xpath("//*[@id=\"emptyCart\"]/div/span[1]")).getText();
    	    String successfullmsg = "Your cart is empty. Have a Cart ID?";
    	    if (titlestatus.equalsIgnoreCase(successfullmsg)) {
    		System.out.println(titlestatus + "::Remove Cart successfully");
    		//System.out.println(">>>>>>>>>>>>>Congratulations Test Success fully Done<<<<<<<<<<<<<<");
    		} else {
    		System.out.println("<<<<< Test Failed>>>>>>");
    	    }
    		driver.quit();

	//driver.quit();
    }}		

  
	
     