package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
static {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Atomation\\driver\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\eclipse-workspace\\Atomation\\driver\\geckodriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		DemoAo.testA(driver);
       WebDriver driver1=new FirefoxDriver();
       DemoAo.testA(driver1);
	}

}
