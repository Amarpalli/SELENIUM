package com.provider.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_User_Registration {

	//1.Create object for Web Driver and import WebDriver package for Maven dependencies

	WebDriver ldriver; //Local driver


	//2.After creating  object for Web Driver then create a constructor . 
	//Constructor name should be exactly similar to class name
	//Constructor will be invoked automatically when we create an object of that class
	//Its primary purpose is to initialize the object's state, allocate resources,
	//and perform any necessary setup. 

	public New_User_Registration(WebDriver rdriver)
	{

		ldriver = rdriver;//local driver initied with remote driver
		PageFactory.initElements(rdriver,this );

		// rdriver will be used to search objects in the web page & 
		//this means all the page objects which will be captured in this java class

	}
	
	//Identify Web Elements
	
	
	@FindBy(linkText = "Register")
	WebElement register;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement Login;
	
	//Identify Action on Web Element
	
	public void ClickOnRegister()
	{
		register.click();
		
	}
	
	public void enterUname(String uname)
	{
		
		UserName.sendKeys(uname);
		
	}
	
	
	public void enterPsd(String Psd)
	{
		
		PassWord.sendKeys(Psd);
		
	}
	
	public void ClickOnLogin()
	{
		Login.click();
		
	}
	



}
