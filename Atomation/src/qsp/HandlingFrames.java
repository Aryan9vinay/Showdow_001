package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE A SCRIPT TO ENTER JSP IN T2 TEXTBOX AND QSP IN T1 TEXTBOX

public class HandlingFrames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// to open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("qsp");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("jsp");
		

	}

}
