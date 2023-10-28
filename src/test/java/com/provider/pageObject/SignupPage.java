package com.provider.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	WebDriver ldriver; //WebDriver is a dataType like int & ldriver is a variable like  (int a)
	
	
	//create constructor
	
	public SignupPage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		
	     PageFactory.initElements(rdriver, this);
		
		
		
	}
	//Captured all web elements available in New User signup page
	
	@FindBy(id = "customer.firstName")
	WebElement firstname;
	
	@FindBy(id = "customer.lastName")
	WebElement lastname;
	
	@FindBy(id = "customer.address.street")
	WebElement Address;
	
	@FindBy(id = "customer.address.city")
	WebElement City;
	
	@FindBy(id = "customer.address.state")
	WebElement State;
	
	@FindBy(id = "customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id = "customer.phoneNumber")
	WebElement phoneNum;
	
	@FindBy(id = "customer.ssn")
	WebElement SSN;
	
	@FindBy(id = "customer.username")
	WebElement usernameN;
	
	@FindBy(id = "customer.password")
	WebElement PasswordN;
	
	@FindBy(id = "repeatedPassword")
	WebElement PasswordR;
	
	@FindBy(xpath ="//input[@value='Register']")
	WebElement Nregister;
	
	
	
	// Then Capture all the actions that needs to be performed over all the web elements captured above
	
	
	public void enterFirstname(String fname)
	{
		firstname.sendKeys(fname);
		
	}
	
	public void enterLastname(String lname)
	{
		lastname.sendKeys(lname);
		
	}
	
	
	public void enterAddress(String addr)
	{
		
		Address.sendKeys(addr);
	}
	
	public void enterCity(String city)
	{
		
		City.sendKeys(city);
	}
	
	public void enterState(String state)
	{
		
		State.sendKeys(state);
	}
	
	
	public void enterzipcode(String zip)
	{
		
		zipcode.sendKeys(zip);
	}
	
	public void enterPhoneNumber(String phnN)
	{
		
		phoneNum.sendKeys(phnN);
	}
	
	public void enterSSN(String ssn)
	{
		
		SSN.sendKeys(ssn);
	}
	
	public void enterUsername(String Uname)
	{
		
		usernameN.sendKeys(Uname);
	}
	
	public void enterPassword(String passd)
	{
		
		PasswordN.sendKeys(passd);
	}
	
	public void enterRPassword(String rpassd)
	{
		
		PasswordR.sendKeys(rpassd);
	}
	
	public void ClickOnRegisterButton()
	{
		
		Nregister.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
