package com.hrms.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class log_reporter {

	@Test
	public void logReportedTesting() {
		Reporter.log("Testing This Reporter");
		Reporter.log("Everyone here from TMT_Batch5 will get 100k");
	}
	
	
}
