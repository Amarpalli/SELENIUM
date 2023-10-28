package com.provider.TestCases;

import org.testng.annotations.Test;

import com.provider.pageObject.New_User_Registration;


public class UserLogin extends BaseClass {
	
	@Test
	public void NewUserLogin() {
	
		logger.info("========Verify if user is able to Login using Valid Credential");	
		
	New_User_Registration nur = new New_User_Registration(driver);
	
	nur.enterUname("demo1");
	
	logger.info("Entered username succeesfully");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	nur.enterPsd("demo1");
	
	logger.info("Entered Password succeesfully");
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	nur.ClickOnLogin();
	
	logger.info("Clicked on Login Button succeesfully");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	}
}
