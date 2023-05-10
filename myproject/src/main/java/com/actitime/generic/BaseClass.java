package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class BaseClass {

static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public WebDriver driver;
public WebDriverWait wait;

@BeforeClass
public void openBrowser() {
	Reporter.log("OpenBrowser", true);
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver,10);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
}
@BeforeMethod
public void loginPage() {
	Reporter.log("login", true);
	FileLibr f=new FileLibr();
	String url = f.getProperty("url");
	String ur = f.getProperty("username");
	String pwd = f.getProperty("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(ur,pwd);
	
}
}