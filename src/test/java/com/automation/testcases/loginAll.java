package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.LoginPageObject;
import com.automation.pages.baseClass;
import com.automation.utiltiy.BrowserFactory;
import com.automation.utiltiy.ExcelDataProvider;

public class loginAll extends baseClass {

	@Test
	public void loginGmail() {
		
		
		LoginPageObject loginPage = PageFactory.initElements(driver, LoginPageObject.class);
		try {
			loginPage.sign(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
