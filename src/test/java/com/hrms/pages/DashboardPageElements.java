package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testBase.Driver;

public class DashboardPageElements {

	@FindBy(id = "search_query_top")
	public WebElement search;
	@FindBy(xpath = "//button[@class='btn btn-default button-search']")
	public WebElement searchinput;
	
	
	
	
	
	
	
	@FindBy(xpath = "")
	public WebElement addEmp;
	@FindBy(id = "Subscriber_link")
	public WebElement subscriberLinkText;
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminPageButton;
	@FindBy(id = "menu_admin_nationality")
	public WebElement NationalityButton;
	@FindBy(id = "nationality_name")
	public WebElement Thai;
	
	
	
	@FindBy(id = "btnAdd")
	public WebElement addButton;
	@FindBy(id = "btnSave")
	public WebElement save;
	
	@FindBy(id = "frmList_ohrmListComponent")
	public WebElement nationallist;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr[*]")
	public List<WebElement> nationalityList;

	
	
	
	
	@FindBy(xpath = "")
	public List<WebElement> dashMenu;
	public DashboardPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	
	
	
}
