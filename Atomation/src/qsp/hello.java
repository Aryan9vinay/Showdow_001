package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hello {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	

	public static void main(String[] args) {
		// TO open the browser
				WebDriver driver=new FirefoxDriver();
				//enter the url go to download page
				driver.get("https://www.selenium.dev/");

	}

}
