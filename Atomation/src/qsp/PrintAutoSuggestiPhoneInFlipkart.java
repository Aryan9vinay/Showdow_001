package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestiPhoneInFlipkart {
static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//go to the www.flipkart.in
		driver.get("https://www.flipkart.com/");
		//type iphone 14 pro in search text box
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(5000);
		//find all the auto suggestion
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro max')]"));
		//Print the count of the auto suggestion
		int count = allSuggestion.size();
		System.out.println(count);
		//Print the text of all auto Suggestion
		for(int i=0;i<count;i++)
		{
			String text = allSuggestion.get(i).getText();
			System.out.println(text);
			}
		
		
		}

}
