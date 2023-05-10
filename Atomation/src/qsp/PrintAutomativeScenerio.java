package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutomativeScenerio {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//go to google.com
		driver.get("https://www.google.com/");
		//type java in search textBox
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		//find all auto suggestion and print the count of auto suggestion
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSuggestion.size();
		System.out.println(count);
		//Print the text of all auto suggestion
		for(int i=0;i<count;i++)
		{
			String text = allSuggestion.get(i).getText();
			System.out.println(text);
			}
		//select first auto suggestion
		allSuggestion.get(0).click();		

	}

}
