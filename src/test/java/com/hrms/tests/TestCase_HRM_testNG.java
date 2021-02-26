package com.hrms.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class TestCase_HRM_testNG {

	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void TestCase_HRM_testNG_Batch6() {
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("userNameId")))
				.sendKeys(ConfigsReader.getProperty("validUserName"));
		Driver.getDriver().findElement(By.id(ConfigsReader.getProperty("passWordId")))
				.sendKeys(ConfigsReader.getProperty("validPassWord"));
		Driver.getDriver().findElement(By.id("btnLogin")).click();
	}
	@Test
	public void TestCase_HRM_testNG_Batch6_AddLanguage() {
		Driver.getDriver().findElement(By.id("menu_admin_viewAdminModule")).click();
		Driver.getDriver().findElement(By.id("menu_admin_Configuration")).click();
		Driver.getDriver().findElement(By.id("menu_admin_languagePackage")).click();
		Driver.getDriver().findElement(By.id("btnAdd")).click();
//		Driver.getDriver().findElement(By.id("addLanguagePackage_name"));
		
		Select s = new Select(Driver.getDriver().findElement(By.id("addLanguagePackage_name")));
//		s.selectByIndex(464);
		s.selectByValue("th_TH");
		
		Driver.getDriver().findElement(By.id("btnSave")).click();
		Driver.getDriver().findElement(By.id("resultTable"));
		WebElement ResultText = Driver.getDriver().findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[9]/td[1]"));
		
		System.out.println(ResultText.getText());
		
	}
		
		
		
		
		
		
		
	
	
	
	
}
