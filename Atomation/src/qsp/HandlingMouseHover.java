package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//AUTOMATIVE FOLLOWING SCENERIO
//GO TO VTIGER.COM
//MOVE MOUSE TO RESOURCE TAB.
//CLICK ON CONTACT US IN DROP-DOWN MENU.
//CAPTURE THE BENGALURU INDIA PHONE NO AND PRINT IN CONSOLE


public class HandlingMouseHover {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TO open the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.partialLinkText("Resources"));
		//move mouse to resourse tab
		Actions a =new Actions(driver);
		a.moveToElement(resource).perform();
		//go to contact
		driver.findElement(By.partialLinkText("Contact ")).click();
		//capture the benguluru india phone no and print in console
		String phNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		
		System.out.println(phNo);
		driver.close();
		

	}

}
