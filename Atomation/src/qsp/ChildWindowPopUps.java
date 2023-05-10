package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE A SCRIPT TO PRINT WINDOW HANDLES AND TITLE OF ALL THE BROWWSER PRESENT IN INDEED AFTER CLICKING APPLE AND FACEBOOK BUTTON

public class ChildWindowPopUps {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TO open the browser
		WebDriver  driver=new ChromeDriver();
		//Enter the URL
		driver.get("https://secure.indeed.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		Set<String> wh = driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for(String h:wh)
		{
			System.out.println(h);
			driver.switchTo().window(h);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		driver.quit();

	}

}
