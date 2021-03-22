package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	WebDriver driver;
	public void LoginPagezobject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/a/span[2]") 	
	WebElement signin;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement login;
	
	public void sign(String emailid,String pass) throws Exception
	{
		signin.click();
		Thread.sleep(9000);
		email.sendKeys(emailid);
		password.sendKeys(pass);
		login.click();
		
	}
	
	
	
}
