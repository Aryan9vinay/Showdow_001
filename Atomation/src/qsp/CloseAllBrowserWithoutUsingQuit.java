package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE THE SCRIPT TO CLOSE ALL THE BROWSER WITHOUT USING QUIT METHOD ABOVE EXAMPLE 
public class CloseAllBrowserWithoutUsingQuit {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://secure.indeed.com/");
		//click on face book
		driver.findElement(By.id("login-facebook-button")).click();
		//click on apple
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh)
{
Thread.sleep(3000);
driver.switchTo().window(wh);
driver.close();

}
	}

}
