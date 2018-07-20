package com.usa.unittesting;

import org.testng.annotations.Test;

public class TestCase1 {
	
	// How to run fail Test cases suppose if have 100 test cases 5 test cases fail, then how you run only the fail test cases?
	//How you resolve the problem either u run whole test cases after fix the problem or only run fail test cases?
	//First i identify the problem through debugging/test output  folder then testng failed xml file then resolve the problem after fix only i run fail test cases.
	//First I have to go target folder/ or test output.Checking the fail xml file.Then right click and run it.The only this way i can run the fail test cases only.
	
	  @Test
	  public void eclipsAppTest() {
	  System.out.println("eclips test is passed");
	  }

}
