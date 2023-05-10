package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpops {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TO Open the Browser
			WebDriver driver=new ChromeDriver();
			//Enter the URL
			driver.get("https://demo.automationtesting.in/Alerts.html");
			//handle the Synchronizaton
			Thread.sleep(3000);
			//find the Element Alert with Ok
			driver.findElement(By.xpath("//a[.='Alert with OK ']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();				
		Alert a = driver.switchTo().alert();
			String t1 = a.getText();
			System.out.println(t1);
			Thread.sleep(3000);
			a.accept();
			driver.close();
}


}
