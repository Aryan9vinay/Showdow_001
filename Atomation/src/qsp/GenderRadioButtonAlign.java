package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButtonAlign {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id");
		int Y1 = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int Y2 = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int Y3 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		if(Y1==Y2||Y2==Y3)
		{
			System.out.println("Gender radio buttons are properly aligned");
		}
		else
		{
			System.out.println("Gender radio buttons are not properly aligned");
		}
		driver.close();
	}

}
