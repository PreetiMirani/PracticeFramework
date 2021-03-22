package com.automation.utiltiy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	
	WebDriver driver;
	
	public static WebDriver startapplication(WebDriver driver,String browsernm,String URLnm)
	{
		if(browsernm.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsernm.equals("Firefox"))
		{
			
		}
		else
			System.out.println("Wrong Browser");
		
		
		driver.get(URLnm);
		driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS);
		return driver;
		
				
	}
	
	public static void cloasebrowser(WebDriver driver)
	{
		driver.quit();
	}

	

	
	

}
