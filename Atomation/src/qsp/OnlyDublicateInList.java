package qsp;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write script to print only dublicate options present in mtr ListBox

public class OnlyDublicateInList {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find the webElement
		WebElement options = driver.findElement(By.id("mtr"));
		Select s=new Select(options);
		List<WebElement> op = s.getOptions();
		LinkedHashSet<String> lhs=new LinkedHashSet();
		LinkedHashSet<String> lhs2=new LinkedHashSet();
		int count=0;
		for(WebElement w:op)
		{
			String t = w.getText();
			if(!lhs.add(t))
			{
//				System.out.println(t);
				lhs2.add(t);
//				count++;
			}
		}
//		System.out.println(count);
		System.out.println("Without duplicates: "+lhs);
		System.out.println("Only duplicates: "+lhs2);

	}

}
