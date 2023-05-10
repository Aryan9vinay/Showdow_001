package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationWithImplicitlywait {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//synchronization 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//go to the url demo.actitime.com
		driver.get("https://demo.actitime.com/");
		//find username and fill the textbox with admin
		driver.findElement(By.id("username")).sendKeys("admin");
	    //find the password textbox and fill textbox with manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click the login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		

	}

}
