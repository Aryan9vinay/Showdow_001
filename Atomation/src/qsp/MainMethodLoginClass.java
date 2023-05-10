package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodLoginClass {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TO open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the url
		driver.get("https://demo.actitime.com/login.do");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("admin");
		lp.setUserPwd("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
