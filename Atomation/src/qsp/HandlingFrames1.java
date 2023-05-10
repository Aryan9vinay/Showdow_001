package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE A SCRIPT TO TYPE ABCD IN T1 AND T2 TEXTBOX ALTERNATIVELY CHARACTER BY CHARACTER

public class HandlingFrames1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("d");
		

	}

}
