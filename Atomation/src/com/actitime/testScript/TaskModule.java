package com.actitime.testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {

	@Test(priority = 1)
	public void createTasks(){
		Reporter.log("createTasks", true);
	}
	@Test(priority = 2,dependsOnMethods = "createTasks")
	public void modifyTasks(){
		Reporter.log("modifyTasks", true);
	}
}
