package com.actitime.testScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WRITE A SCRIPT TO TAKE THE SCREENSHOT OF THE WEBPAGE
public class DemoScreenShot {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void screenShot() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot st=(TakesScreenshot)driver;
	//pressing the print screen button
	File src=st.getScreenshotAs(OutputType.FILE);
	//create a empty file in the below path
	File dest=new File("./Screenshot/ss.png");
	//copy and paste the Screenshot from src to dest
	FileUtils.copyFile(src, dest);
	driver.close();
	
}
}
