package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUserPwdTextBoxEqual {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	WebElement user = driver.findElement(By.id("username"));
	WebElement pswd = driver.findElement(By.name("pwd"));
	int height1 = user.getSize().getHeight();
	int height2 = pswd.getSize().getHeight();
	int width1=user.getSize().getWidth();
	int width2=pswd.getSize().getWidth();
	if(height1==height2||width1==width2)
	{
		System.out.println("user & pwd text are equal");
		
	}
	else {
		System.out.println("user & pwd text are not equal");
	}
	driver.close();
	}

}
