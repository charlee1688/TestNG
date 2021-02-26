package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
import com.hrms.utils.CommonMethods;


public class sauceDemoLoginPage extends CommonMethods {

	@FindBy (id="user-name")
	public WebElement userName;
	
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (xpath="")
	public WebElement LoginBTN;
	
	@FindBy (xpath="")
	public WebElement productLogo;
	
	@FindBy (xpath="")
	public WebElement errorMEssage;
	
	public sauceDemoLoginPage() {
		PageFactory.initElements(BaseClass.driver, this);
		
}
}