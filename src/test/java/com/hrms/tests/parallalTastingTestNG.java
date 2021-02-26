package com.hrms.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallalTastingTestNG {

	WebDriver driver;
	
	// run 1 code 2 browser same time
	
	@Test
	public void ChromeTest() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.demoqa.com");
	}
	
	@Test
	public void FirefoxTest() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://www.demoqa.com");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
