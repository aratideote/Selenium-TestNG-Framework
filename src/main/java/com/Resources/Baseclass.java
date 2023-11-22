package com.Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {

	public WebDriver driver;

	 public void intializeDriver() throws IOException {
	  // To read the data of properties file
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\data.properties");

	    
	  // To access the properties file
	  Properties prop = new Properties();

	  prop.load(fis);

	  String browserName = prop.getProperty("browser");

	  if (browserName.equalsIgnoreCase("chrome")) {

	   driver = new ChromeDriver();

	  }

	  else if (browserName.equalsIgnoreCase("firefox")) {

	   driver = new FirefoxDriver();
	  }

	  else if (browserName.equalsIgnoreCase("edgeDirver")) {

	   driver = new EdgeDriver();
	   }

	
	 }
	 @BeforeClass
	 public void launchBrowser() throws IOException {
		  
		  intializeDriver();
		 
		 driver.get(prop.getProperty("url"));

     }
	 public String generateRandomEmail() {
		
		 return System.currentTimeMillis()+"@gmail.com";
		 
	 }
	 
}

