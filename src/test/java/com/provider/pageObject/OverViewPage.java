package com.provider.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OverViewPage {
	
	WebDriver ldriver;
	
	public  OverViewPage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	@FindBy(linkText = "Open New Account")
	
	WebElement Open_new_account;
	
    @FindBy(xpath = "//select[@id ='type']")
	
	WebElement typeOfAccount;
    
   @FindBy(xpath = "//select[@id='fromAccountId']")
	
	WebElement fromAccountID;
   
   @FindBy(xpath = "//input[@value='Open New Account']")
	
	WebElement ButtonNewAccount;
   
   
   
   public void ClickonOpenNewAccountLink() {
	   Open_new_account.click();
	   
   }
   
   public void typeOfAccount(String acctype) 
   
   {
	  Select obj = new Select(typeOfAccount);
	  obj.selectByVisibleText(acctype);
	   
   }
   
public void fromAccountID(String FAI) 
   
   {
	  Select obj1 = new Select(fromAccountID);
	  obj1.selectByVisibleText(FAI);
	   
   }


public void ClickonButtonNewAccount() {
	ButtonNewAccount.click();
	   
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
