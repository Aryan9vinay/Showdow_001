package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoctorPartialLinkText {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Hp/Desktop/demo.html");
		driver.findElement(By.partialLinkText("goo")).click();
		Thread.sleep(1200);
		driver.navigate().back();
		driver.findElement(By.partialLinkText("oogle")).click();
		driver.close();
		
		
	}

}
