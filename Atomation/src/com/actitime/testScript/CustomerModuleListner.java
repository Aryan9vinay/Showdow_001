package com.actitime.testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModuleListner
{
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer", true);
		Assert.fail();
		
	}

	
	
}
