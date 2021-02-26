package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class nationalities_Tests {

//	Enter valid username
//	enter Valid password
//	Click on login button
//	Navigate to Admin Page
//	Click on Nationality Tab and enter Country
//	Click on Add button and save button
//	User Sees the country added  and its in the list
	
	
	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest1() {
		
		LoginPageElements loginPageObject = new LoginPageElements();

		loginPageObject.username.sendKeys(ConfigsReader.getProperty("validUserName"));
		loginPageObject.password.sendKeys(ConfigsReader.getProperty("validPassWord"));
		loginPageObject.loginBtn.click();
	
		DashboardPageElements dashBoardObject = new DashboardPageElements();

		System.out.println(dashBoardObject.subscriberLinkText.getAttribute("value"));
		
		Assert.assertEquals(dashBoardObject.subscriberLinkText.getAttribute("value"), "Subscribe");
	

//		Navigate to Admin Page
		dashBoardObject.adminPageButton.click();
//		Driver.getDriver().findElement(By.id("menu_admin_viewAdminModule")).click();
		
//		Click on Nationality Tab and enter Country
		dashBoardObject.NationalityButton.click();

//		Click on Add button and save button
		dashBoardObject.addButton.click();
		Driver.getDriver().findElement(By.id("nationality_name")).sendKeys("Thai");
//		dashBoardObject.Thai.click();
		dashBoardObject.save.click();
		
//		User Sees the country added  and its in the list
		for(WebElement eachCountry : dashBoardObject.nationalityList) {
			System.out.println(eachCountry.getText());
		}
		
		
	}
	
	
}
