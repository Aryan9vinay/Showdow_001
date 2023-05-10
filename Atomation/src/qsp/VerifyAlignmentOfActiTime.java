package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignmentOfActiTime {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int x = driver.findElement(By.id("username")).getLocation().getX();
		int y = driver.findElement(By.name("pwd")).getLocation().getX();
		if(x==y)
		{
			System.out.println("user and password text box align");
		}
		else
		{
			System.out.println("user and password text box not align");
		}
		
driver.close();
	}

}
