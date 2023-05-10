package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WRITE THE SCRIPT TO PRINT  POPUPS IN FIREFOX BROWSER

public class PrintPopUpsInFirefox {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TO open the browser
		WebDriver driver=new FirefoxDriver();
		//enter the url go to download page
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);		

	}

}
