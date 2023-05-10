package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE SCRIPT OF JAVA ON MULTISELECTLISTBOX

public class MultiSelectListBox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//go to mtr 
		Thread.sleep(3000);
		WebElement mtr = driver.findElement(By.id("mtr"));
		//create an object of select class of ui package
		Select s=new Select(mtr);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("sr");
		Thread.sleep(1000);
		s.selectByVisibleText("chholaBatura");
		Thread.sleep(1000);
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByValue("sr");
		
		s.deselectByVisibleText("chholaBatura");

	}

}
