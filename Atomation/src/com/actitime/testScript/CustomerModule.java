package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class CustomerModule {

	@Test(priority=1)
	public void createCustomer(){
		Reporter.log("createCustomer",true);
	}
	
	@Test(priority=2,dependsOnMethods="CreateCustomer")
	
	public void modifyCustomer(){
	Reporter.log("modifyCustomer", true);
	}
	@Test(priority=3,dependsOnMethods= {"createCustomer","modifyCustomer"})
	public void deleteCustomer(){
		Reporter.log("deleteCustomer", true);
	}
		
	}