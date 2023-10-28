package com.provider.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.provider.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;


//The methods will be used in all the Test Cases
public class BaseClass {


	//Here I am getting the url & browser details from  ReadConfig class. So I created an object readconfig
	//of ReadConfig class to use the variables & methods defined in ReadConfig class under utilities package

	ReadConfig readconfig = new ReadConfig();

	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	//declares a variable named driver of type WebDriver in Java.WebDriver is an interface 
	//provided by the Selenium WebDriver framework that defines a set of methods for interacting with web browsers.
	@BeforeClass
	public void setup() {

		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;

		}

		//implicit wait of 10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//for logging
		logger = LogManager.getLogger("ProviderManagementV1");

		//open url
		driver.get(url);
		logger.info("url opened");
	}
		@AfterClass
		public void teardown()
		{
			driver.close();
			driver.quit();
		}


		//user method to capture screen shot
		public void captureScreenShot(WebDriver driver,String testName) throws IOException
		{
			//step1: convert webdriver object to TakesScreenshot interface
			TakesScreenshot screenshot = ((TakesScreenshot)driver);

			//step2: call getScreenshotAs method to create image file

			File src = screenshot.getScreenshotAs(OutputType.FILE);

			File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}






	}




