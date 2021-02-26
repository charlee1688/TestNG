package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;


public class AddEmployeePageElements extends CommonMethods {

	
	
	@FindBy(xpath = "//a[@id=\"menu_pim_addEmployee\"]")
	public WebElement addEmpTab;
	
	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy (xpath="//input[@id='middleName']")
	public WebElement middleName;  //-->
	
	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;

	
	//--------------
	public void creatLoginCr(String uid, String pwd) {
//		checkboxLoginDetails.click();
//		sendText(username, "Josephine7");
//		sendText(password, "Sephine@Kjy123");
		
		//Select select = new Select(status);
		//select.deselectByVisibleText("Enabled");
		//wait(3);
		//saveButton
		
	} 

	

}