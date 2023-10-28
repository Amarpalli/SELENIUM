package com.provider.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

 //1.Properties is a class that is part of the Java I/O (Input/Output) library and is used for managing
//key-value pairs,often used for storing and retrieving configuration or settings information.
//2.FileInputStream is a class in Java that is used to read bytes from a file. 
//It's a part of the Java I/O (Input/Output) library and is commonly used for reading data from files on disk.

//3.In the code,the FileInputStream named fis is used to read the key-value pairs stored in a
//properties file, such as "config.properties." 
//The Properties object is then used to store and manage these key-value pairs in memory.

public class ReadConfig {

	Properties properties;

	String path = "C:\\Users\\Lenovo\\Desktop\\Selenium_java_handson\\ProviderManagementV1\\Configuration\\config.properties";
	
	public ReadConfig()
	{
		try {
		properties = new Properties();

		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		}
		
		catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public String getBaseUrl()
	
	{
		
		String value = properties.getProperty("baseUrl");
		
		if(value != null)
			return value;
		
		else throw new RuntimeException("Url not specified in config file");
		
	}
	
public String getBrowser()
	
	{
		
		String value = properties.getProperty("browser");
		
		if(value != null)
			return value;
		
		else throw new RuntimeException("browser not specified in config file");
		
	}
}
