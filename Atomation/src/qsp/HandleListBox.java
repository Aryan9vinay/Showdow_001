package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write a java Script to Handle ListBox in facebok create account page in date of birth (month section)
public class HandleListBox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url 
		driver.get("https://www.facebook.com/");
		//go to login page and click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		//Synchronized it 
		Thread.sleep(3000);
		//in sign up page,go to date of birth select month
		WebElement list = driver.findElement(By.id("month"));
		//create an object of Select class and pass argument of refenceVariable of WebElement
		Select s=new Select(list);
		//select month on list of month in date of birth
		s.selectByIndex(10);
		Thread.sleep(3000);
		s.selectByValue("7");
		Thread.sleep(3000);
		s.selectByVisibleText("Mar");
		//close the browser
		driver.close();
		
	}

}
