package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SynchronizationWithExplicitly {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url(https://demo.actitime.com/)
		driver.get("https://demo.actitime.com/");
		//find the textbox username and fill the textbox with admin
		driver.findElement(By.id("username")).sendKeys("admin");
		//find the textbox of password and fill the textbox with manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//find the Login button and click it
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Synchronize the locators
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		//Print the Title
		String title = driver.getTitle();
		System.out.println(title);
		
		

	}

}
