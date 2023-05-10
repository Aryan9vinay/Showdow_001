package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseClass;

public class CustomerModule4 extends BaseClass {

	@Test
	public void createCustomer() {
		Reporter.log("createCustomer", true);
	}
}
