package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    static {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Atomation\\driver\\chromedriver.exe");
    }
	public static void main(String[] args) {
		//open the browser
		ChromeDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://www.google.com");
		//print the title of the url/browsing site
		String title=driver.getTitle();
		System.out.println(title);
      //close the browsing
		driver.close();

	}
}
