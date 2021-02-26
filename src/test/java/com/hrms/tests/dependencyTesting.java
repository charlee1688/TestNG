package com.hrms.tests;

import org.testng.annotations.Test;

public class dependencyTesting {

	@Test
	public void testPrintMessage() {
		System.out.println("HelloWorld");
	}
	
	@Test(dependsOnMethods = {"initEnvironmentTest"})
	public void testSalutationMessage() {
		System.out.println("this is the dependent one");
	}
	
	@Test
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
	}
	
	
	
}
