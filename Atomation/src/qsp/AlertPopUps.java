package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE THE SCRIPT ALERT/JAVASCRIPT POPuPS
public class AlertPopUps {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TO open Browser
		WebDriver driver = new ChromeDriver();
		//Enter the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//find the Element of click button to display alert text box
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//handle the synchronization
		Thread.sleep(3000);
		//to handle alert/javascript popups we use
		//String text = driver.switchTo().alert().getText();
		//print the text of popups
		//System.out.println(text);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		driver.close();
		
		

	}

}
