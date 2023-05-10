package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {

	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=1,invocationCount=2)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test
	public void delete() {
		Reporter.log("delete", true);
	}
	
}
