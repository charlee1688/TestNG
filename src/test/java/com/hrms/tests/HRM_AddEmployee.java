package com.hrms.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrms.testBase.Driver;
import com.hrms.utils.ConfigsReader;

public class HRM_AddEmployee {

	@BeforeMethod(alwaysRun = true)
	public void beforeClass() {
		Driver.getDriver().get(ConfigsReader.getProperty("url"));
//		Driver.getDriver().manage().window().maximize();
//		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testaddemployee() throws Throwable   {

		String path = "DemoFile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheetAt(1);
		
		Cell userName = sheet.getRow(1).getCell(0);
	    String userID = userName.toString();
	    Driver.getDriver().findElement(By.id("txtUsername")).sendKeys(userID);
	    System.out.println(userID);
	    
	    Cell passWord = sheet.getRow(1).getCell(1);
		String passID = passWord.toString();
		Driver.getDriver().findElement(By.id("txtPassword")).sendKeys(passID);
		System.out.println(passID);
		
		Driver.getDriver().findElement(By.id("btnLogin")).click();
		
		Driver.getDriver().findElement(By.id("menu_pim_viewPimModule")).click();
		
		Driver.getDriver().findElement(By.id("menu_pim_addEmployee")).click();
		
		Cell nameEmp = sheet.getRow(1).getCell(2);
		String nameID = nameEmp.toString();
		Driver.getDriver().findElement(By.id("firstName")).sendKeys(nameID);
		System.out.println(nameID);
		
		Cell lastEmp = sheet.getRow(1).getCell(3);
		String lastID = lastEmp.toString();
		Driver.getDriver().findElement(By.id("lastName")).sendKeys(lastID);
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
