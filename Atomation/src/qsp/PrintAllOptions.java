package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE THE TEST SCRIPT OF ALL OPTION IN MTR LIST
public class PrintAllOptions {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TOopen the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find the webElement of the mtr list box
		WebElement mtr = driver.findElement(By.id("mtr"));
		//create select constructor
		Select s=new Select(mtr);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		for(int i=0;i<count;i++)
		{
			String list = options.get(i).getText();
			System.out.println(list);
		}
		driver.close();

	}

}
