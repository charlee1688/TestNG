package com.hrms.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {

	// run 3 time in 1 method
	
	
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "Kanin" }, { "Park" },{ "Gift" } };
	}
	@Test(dataProvider = "data-provider")
	public void myTest(String val) {
		System.out.println("My Name : " + val);
	}
}
