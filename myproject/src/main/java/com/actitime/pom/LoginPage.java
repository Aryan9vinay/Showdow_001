package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy()
private WebElement untbx;
@FindBy()
private WebElement pwtbx;
@FindBy()
private WebElement lgbtm;
@FindBy()
private WebElement lgotbtm;

public LoginPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void setLogin(String un,String pwd) throws InterruptedException
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	lgbtm.click();
	Thread.sleep(3000);
	lgotbtm.click();
}

}
