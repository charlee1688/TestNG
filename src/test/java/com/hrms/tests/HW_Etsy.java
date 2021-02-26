package com.hrms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class HW_Etsy {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_Etsy_Order() {
		
		// 3. enter search term "Linux Quick Reference Poster" 	= linux quick reference poster - Etsy
		Driver.getDriver().findElement(By.id("global-enhancements-search-query")).sendKeys("linux quick reference poster");
		
		// 4. click search
		Driver.getDriver().findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[1]/button")).click();
		
		// 5. click on the first result
		Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div[3]/div[2]/div[3]/div/div[1]/div/li[1]/div/a/div[1]/div/div/div/div/div/img")).click();
		
		// 6. click on Add to cart
		Driver.getDriver().findElement(By.xpath("//div//*[@class='add-to-cart-form']")).click();
		
		// 7. verify text 	= 1 item in your cart
		WebElement verifyText = Driver.getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div/div/div[1]/h1"));
		System.out.println(verifyText.getText());
		
		// 8. verify Proceed to checkout button displayed
		
		
		
		
		// 9. verify item name 	= Terminal/Unix Reference Mug for Mac and Linux (Dark Mode)
		
		
		
		
		// 10. verify item count	= 1
		
		
		
		
		// 11. verify item price	= 14.99
		
		
		
		
		// 12. verify shopping cart icon text	= 1
		
		
		
		
		
	}
		
}
