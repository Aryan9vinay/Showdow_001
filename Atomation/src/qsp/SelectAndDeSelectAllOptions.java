package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE A SCRIPT TO SELECT ALL THE OPTION PRESENT IN MTR CHECKBOX AND DESELECT THEM

public class SelectAndDeSelectAllOptions {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find the Element
		WebElement option = driver.findElement(By.id("cp"));
		//Create an Object of Select Class of support.ui package 
		Select s =new Select(option);
		List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			s.selectByIndex(i);
			
		}
		for(int i=allOptions.size()-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
driver.close();
	}

}
