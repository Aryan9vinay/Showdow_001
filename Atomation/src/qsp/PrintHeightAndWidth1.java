package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement wbl=driver.findElement(By.name("login"));
		int height=wbl.getSize().getHeight();
		int width=wbl.getSize().getWidth();
		System.out.println("Height"+height);
		System.out.println("Width"+width);
		
		
		driver.close();

	}

}
