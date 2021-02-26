package com.hrms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class HW_Etsy_Signin {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_Etsy_Signin_Positive() {
		
		// 2. click Sign in link
		Driver.getDriver().findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")).click();
				
		// 3. enter Emaail or Username
		Driver.getDriver().findElement(By.xpath("//div//input[@id='join_neu_email_field']")).sendKeys("hotele1516@lovomon.com");
				
		// 4. enter Password "password"
		driver.findElement(By.xpath("//div//input[@id='join_neu_password_field']")).sendKeys("abc123456");
		
		// 5. click Sign in button
		driver.findElement(By.xpath("//*[@class='wt-btn wt-btn--primary wt-width-full']")).click();
				
		// 6. verify title		= Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		// 7. verify Your account displayed
		driver.findElement(By.xpath("//*[@class='wt-text-title-01 wt-m-xs-0']"));
		
		
		
		
		
	}

	@Test
	public void test_Etsy_Signin_Negative() {
	
		// 2. click Sign in link
		Driver.getDriver().findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button")).click();
				
		// 3. enter Emaail or Username "tomsmith365"

		Driver.getDriver().findElement(By.xpath("//div//input[@id='join_neu_email_field']")).sendKeys("tomsmith365");
		
		// 4. enter Password "adfasdfsadfasdf"		
		Driver.getDriver().findElement(By.xpath("//div//input[@id='join_neu_password_field']")).sendKeys("adfasdfsadfasdf");

		// 5. click Sign in button
		Driver.getDriver().findElement(By.xpath("//*[@class='wt-btn wt-btn--primary wt-width-full']")).click();
				
		// 6. verify error message	= Password was incorrect
		String errmsg = "Password was incorrect."; 
		Driver.getDriver().findElement(By.id("//div[@id='aria-join_neu_password_field-error']"));
		System.out.println(errmsg);
		
		
	}
	
}
