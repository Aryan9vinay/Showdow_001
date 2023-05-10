package com.actitime.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAssertion1 {
	
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle= "Soogle";
	String aTitle=driver.getTitle();
	if(aTitle.equals(eTitle)) {
		System.out.println("Title is match and pass");
	}
	else {
		System.out.println("Title is not match and fail");
	}
	driver.close();
}
}
