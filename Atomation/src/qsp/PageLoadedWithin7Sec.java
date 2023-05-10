package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to check whether login is loaded within 7 sec or not

public class PageLoadedWithin7Sec {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//to check whether login is loaded within 7 sec
		driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);//TimeUnit is the class
		
		//enter the url and handle the Synchronization
		try {
		driver.get("https://demo.actitime.com/");
		System.out.println("page is loaded within 7 sec and pass");
		}
		
catch(Exception e) {
	System.out.println("page is not loaded within 7 sec and fails");
}
	driver.close();
	}

}
