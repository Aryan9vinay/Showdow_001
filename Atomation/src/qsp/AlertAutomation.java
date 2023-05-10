package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAutomation {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		//enter the url
		
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.dismiss();
		String text2="You Pressed Cancel";
		Thread.sleep(3000);
		String text1 = driver.findElement(By.id("demo")).getText();
		if(text2.equals(text1))
		System.out.println(text1);	
		driver.close();

	}

}
