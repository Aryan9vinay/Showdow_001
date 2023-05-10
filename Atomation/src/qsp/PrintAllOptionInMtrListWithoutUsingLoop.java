package qsp;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE A SCRIPT TO PRINT ALL THE OPTION OF MTR LISTBOX WITHOUT USING ANY LOOPING STATEMENT

public class PrintAllOptionInMtrListWithoutUsingLoop {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find the WebElement
		WebElement option = driver.findElement(By.id("mtr"));
		//Create an object of Select Class of Support.ui package and pass an argument of refVar of WebElement
	Select s=new Select(option);
	String text = s.getWrappedElement().getText();
	//Print the list 
	System.out.println(text);
	driver.close();
	
	
	
		
		
		
		

	}

}
