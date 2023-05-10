package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String URL=driver.getCurrentUrl();
		if(URL.equals("https://www.selenium.dev/"))
		{
			System.out.println("URL is navigating successfully and Pass");
					}
		else {
			System.out.println("URL is not navigating successfuly and fail");
					}
		driver.close();
		

	}

}
