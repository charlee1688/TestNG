package com.hrms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowserTesting_Batch5 {

	WebDriver driver;
	
	// run 1 code 2 browser
	
	// Passing Browser parameter from TestNG xml
	@Parameters("browser")
	@BeforeClass
	public void beforeTest(String browser) {
		// If the browser is Firefox, then do this
		if (browser.equalsIgnoreCase("firefox")) {
			// Initializing the firefox driver (Gecko)
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			// Initialize the chrome driver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		// Enter the website address in the browser
		driver.get("https://www.demoqa.com");
	}
	// Once Before method is completed, Test method will start
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	}
	@AfterClass
	public void afterTest() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
