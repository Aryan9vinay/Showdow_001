package qsp;
//write a script to check customWait Synchronizaton
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationCustomWait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		//open  the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url
		driver.get("https://demo.actitime.com/");
		//go to username textbox and Enter the username
		driver.findElement(By.name("username")).sendKeys("admin");
		//go to passward textbox and Enter the passward
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click to Login button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//handle the Synchronization of the automation Script by customWait
		int x=100;
		while(x>0) {
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(NoSuchElementException e)
		{
			x--;
		}
		

	}
		}
	

}
