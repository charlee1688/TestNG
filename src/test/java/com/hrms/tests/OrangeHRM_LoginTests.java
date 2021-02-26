package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class OrangeHRM_LoginTests {

	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//	1. login using the valid credentials, and user should be able to successfully 
	 //login and see the dashboard/landing page
	//2. try loging in using a valid username and invalid password, and user should 
	 //see "Invalid credentials"
	
	// 3. invalid username,  valid password
		// 4. invalid username, invalid password
		// 5. blank username , valid password
		// 6. valid username, blank password
	

	
//	1. login using the valid credentials, and user should be able to successfully 
	 //login and see the dashboard/landing page

	@Test(priority = 1, groups = { "login" })
	public void Login_ValidUsername_ValidPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("validPassWord"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();
		String welcomeText = Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("welcomeTextId")))
				.getText();
		String expectedWelcomeText = "Welcome Paul";
		Assert.assertEquals(welcomeText, expectedWelcomeText);
		
	}
	
	//2. try loging in using a valid username and invalid password, and user should 
	//   see "Invalid credentials"
		
	@Test(priority = 0, groups = { "login" })
	public void Login_validUsername_InvalidPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("invalidPassword"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();
		String invalidCredentialMessage = Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("spanMessageError")))
				.getText();
		String expectedCredentialMessage = "Invalid credentials";
		Assert.assertEquals(invalidCredentialMessage, expectedCredentialMessage);
		
	}
	
	// 3. invalid username,  valid password
	@Test(priority = 0, groups = { "login" })
	public void Login_InvalidUsername_validPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("invalidUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("validPassWord"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();

	}
	
	// 4. invalid username, invalid password
	@Test(priority = 0, groups = { "login" })
	public void Login_InvalidUsername_InvalidPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("invalidUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("invalidUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();

	}
	
	// 5. blank username , valid password
	@Test(priority = 0, groups = { "login" })
	public void BlankUsername_validPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("blankUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("validPassWord"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();
		
	}
	
	// 6. valid username, blank password
	@Test(priority = 0, groups = { "login" })
	public void Login_InvalidUsername_BlankPassword() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("blankPassword"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("loginButtonId"))).click();

		
		
	}
	
	
	
	
	
	
	
	
	
}
