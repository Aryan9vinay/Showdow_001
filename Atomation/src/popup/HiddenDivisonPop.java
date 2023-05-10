package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisonPop {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
   WebDriver driver=new ChromeDriver();
   Thread.sleep(3000);
   driver.get("https://www.flipkart.com/");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//div[@class='exehdJ' and text()='More']")).click();
   driver.findElement(By.xpath("//div[text()='Notification Preferences']")).click();
 String t = driver.findElement(By.xpath("//li[text()='Desktop Notifications']")).getText();
System.out.println(t);
driver.close();
	}

}
