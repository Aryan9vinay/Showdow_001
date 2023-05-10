package qsp;
//WRITE THE SCRIPT FOR CHILD WINDOW POPUP/CHILD BROWSER POPUPS AND PRINT THE ID OF WINDOW

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopuporChildBrowserPopUp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			// TO open the browser
			WebDriver driver=new ChromeDriver();
			//Enter the URL
			driver.get("https://secure.indeed.com/");
			String wh = driver.getWindowHandle();
			
			System.out.println(wh);
			driver.close();

		}

}
