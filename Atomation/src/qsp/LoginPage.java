package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
private WebElement user; //declaration
 private WebElement pwd; //declaration
public LoginPage(WebDriver driver)
{
user=driver.findElement(By.id("username"));//initialization	
pwd=driver.findElement(By.name("pwd"));//initialization
}
public void setUserName(String un)
{
user.sendKeys(un);//utilization	
}
public void setUserPwd(String pw)
{
pwd.sendKeys(pw);
	}
}
