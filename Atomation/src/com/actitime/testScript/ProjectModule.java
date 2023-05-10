package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {

	@Test(priority =1)
	public void createProject() {
		Reporter.log("createProject", true);
			}
	@Test(priority =2,dependsOnMethods ="createProject")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer", true);
	}
	
}
