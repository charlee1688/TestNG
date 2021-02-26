package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class AdminPageElements {
	
	
	@FindBy(id = "btnAdd")
	public WebElement addButton;
	
	@FindBy(id = "menu_admin_nationality")
	public WebElement nationalityTab;
	
	
	
	

	public AdminPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	
	
	

}
