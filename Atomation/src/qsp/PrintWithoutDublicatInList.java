package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDublicatInList {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		WebElement cpList = driver.findElement(By.id("mtr"));
		//create an object of Select class and pass argument of refVar of webElement
		Select s=new Select(cpList);
		 List<WebElement> allOption = s.getOptions();
		int count=allOption.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println( allOption.get(i).getText());
		}
		//System.out.println(h);
	}

}
