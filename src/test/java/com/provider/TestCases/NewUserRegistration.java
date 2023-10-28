package com.provider.TestCases;

import org.testng.annotations.Test;

import com.provider.pageObject.New_User_Registration;
import com.provider.pageObject.SignupPage;

public class NewUserRegistration extends BaseClass {
@Test
	public void verifyRegistration()
	{


		New_User_Registration pg = new New_User_Registration(driver);

		pg.ClickOnRegister();
		
		logger.info("Clicked on sign in link");

		SignupPage myAcpg = new SignupPage(driver);
		myAcpg.enterFirstname("demo");
		logger.info("entered first name in register section.");

		myAcpg.enterLastname("user");

		logger.info("entered last name in register section.");

		myAcpg.enterAddress("demoaddr");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myAcpg.enterCity("democity");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myAcpg.enterState("demostate");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myAcpg.enterzipcode("6346453");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myAcpg.enterPhoneNumber("847736666");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myAcpg.enterSSN("7444");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		myAcpg.enterUsername("demo1");
		myAcpg.enterPassword("demo1");
		myAcpg.enterRPassword("demo1");

		logger.info("entered user details on Register page.");

		myAcpg.ClickOnRegisterButton();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger.info("clicked on Register button");

		
		logger.info("***************TestCase Verify Registration *****************"); 

	}
}
