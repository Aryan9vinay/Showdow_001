package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE THE SCRIPT TO PRINT ALL THE OPTION PRESENT IN CHECKPOST LISTBOX

public class PrintAllOptionsInCheckPost {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		WebElement cpList = driver.findElement(By.id("cp"));
		//create an object of Select class and pass argument of refVar of webElement
		Select s=new Select(cpList);
		List<WebElement> allOption = s.getOptions();
		for(int i=0;i<allOption.size();i++)
		{
			String text = allOption.get(i).getText();
			//Print all the Options present the checkPost
			System.out.println(text);
		}

	}

}
