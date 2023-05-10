package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//open the browser
//go to google.com
//type java in search textbox
//find all the auto suggestion and print the count of auto suggestion
//print the text of all auto suggestion
//select the firsst auto suggestion

public class PrintAutoSuggestionOnGoogle {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.google.com/");
		//type java in search textbox
		driver.findElement(By.name("q")).sendKeys("java");
		//synchronized webElement
		Thread.sleep(3000);
		//find all the auto suggestion and print the count
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = sugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = sugg.get(i).getText();
			System.out.println(text);
		}
		
sugg.get(0).click();
	}

}
