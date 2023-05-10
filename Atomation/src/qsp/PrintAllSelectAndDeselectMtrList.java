package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE A SCRIPT TO SELECT ALL OPTIONS PRESENT IN MTR CHECKBOX AND DESELECT THEM

public class PrintAllSelectAndDeselectMtrList {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TO open the browser
		WebDriver driver= new ChromeDriver();
		//enter the url
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find webElement of mtr 
		WebElement option = driver.findElement(By.id("mtr"));
		//create a constructor of select class and pass argument of webElement
		Select s=new Select(option);
		List<WebElement> options = s.getOptions();
		
		int count = options.size();
		for(int i=0;i<count;i++)
		{
		 s.selectByIndex(i);
			
		}
for(int i=count-1;i>=0;i--)
{
	s.deselectByIndex(i);
	}
	}

}
