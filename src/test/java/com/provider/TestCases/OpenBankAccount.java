package com.provider.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.provider.pageObject.New_User_Registration;
import com.provider.pageObject.OverViewPage;
import com.provider.utilities.ReadExcelFile;

public class OpenBankAccount extends BaseClass {
	
	@Test(dataProvider = "LoginDataProvider")
	public void newaccountCreation(String username , String Password , String accountType)
	{
		
		logger.info("/////////Creating New Bank Account for User\\\\\\\\\\\\\\\\");
	
	New_User_Registration nur1 = new New_User_Registration(driver);
	
	
	
	nur1.enterUname(username);
	
	logger.info("Enter User Name to login");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	nur1.enterPsd(Password);
	
	logger.info("Enter Password to login");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	nur1.ClickOnLogin();
	
	logger.info("Clicked on login button to login");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	OverViewPage ovp = new OverViewPage(driver);
	
	ovp.ClickonOpenNewAccountLink();
	
	logger.info("Clicked on Open New Account link for creating an account for User");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	ovp.typeOfAccount(accountType);
	
	logger.info("Selected the type of Account User wants to create");
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ovp.fromAccountID("15342");
	
	
	logger.info("Selected the Account from which we can take 100$ to create new Account");
	
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ovp.ClickonButtonNewAccount();
	
	
	logger.info("Clicked on OpenNewAccount Button");
	
	}
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows-1][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
	}

}

