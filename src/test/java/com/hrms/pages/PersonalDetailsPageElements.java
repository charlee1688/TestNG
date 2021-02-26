package com.hrms.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.BaseClass;
import com.hrms.utils.CommonMethods;


public class PersonalDetailsPageElements extends CommonMethods{

	@FindBy(id = "personal_txtLicenNo")
	public WebElement DLNumber;
	
	@FindBy(id = "personal_txtLicExpDate")
	public WebElement LicenseExpiryDate;
	
	@FindBy(id = "")
	public WebElement SSNNumber;
	
	@FindBy(id = "")
	public WebElement nationalityDD;

	@FindBy(name = "")
	public List<WebElement> genderRadioGroup;

	@FindBy(xpath = "")
	public WebElement lblPersonalDetails;

	@FindBy(id = "")
	public WebElement employeeId;
	
	@FindBy(xpath="")
	public WebElement profilePic;

	@FindBy( id = "")
	public WebElement nickName;
	
	@FindBy(id = "")
	public WebElement MilitaryService;
	
	@FindBy(id = "")
	public WebElement SINNumber;
	
	@FindBy (id = "") 
	public WebElement MaritalStatus;
	
	@FindBy(id="")
	public WebElement DateofBirth;
	
	@FindBy(id="")
	public WebElement Smoker;
	
	@FindBy(id = "")
	public WebElement editBtn;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}


 
