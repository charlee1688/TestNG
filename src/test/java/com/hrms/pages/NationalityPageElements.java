package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class NationalityPageElements {

	@FindBy(id = "nationality_name")
	public WebElement nationalityInputBox;
	@FindBy(id = "btnSave")
	public WebElement saveButton;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[*]")
	public List<WebElement> nationalityList;
	public NationalityPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
}
