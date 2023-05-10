package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColorFontSize {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
 
String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
String family = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
System.out.println("color"+color);
System.out.println("font-size"+size);
System.out.println("font-family"+family);
driver.close();
	}

}
