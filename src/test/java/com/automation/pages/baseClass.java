package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utiltiy.BrowserFactory;
import com.automation.utiltiy.ConfigFile;
import com.automation.utiltiy.ExcelDataProvider;

public class baseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigFile con;
	
	@BeforeSuite
	public void beforeSuiteConfig()
	{
		 excel=new ExcelDataProvider();
		 con=new ConfigFile();
		 
	}
	
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startapplication(driver, con.getBrowser(),con.stagingURL());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.cloasebrowser(driver);
	}
	

}
