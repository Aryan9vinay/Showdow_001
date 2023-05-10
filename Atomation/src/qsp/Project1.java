package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//AUTOMATE THE FOLLOWING SCENARIO
//OPEN THE BROWSER
//GO TO DEMO.ACTITIME.COM
//LOGIN TO ACTITIME
//CLICK ON ABOUT YOUR ACTITIME PRESENT UNDER HELP DROPDOWN
//CLICK ON READ SERVICE AGREEMENT PRESENT IN POPUP
//CAPTURE ALL THE HEADINGS PRESENT IN NEW TAB
//PRINT ALL THE HEADINGS AND CLOSE THE NEW TAB
//CLOSE THE PARENT TAB
public class Project1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the Url
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		Thread.sleep(3000);
	 List<WebElement> headings = driver.findElements(By.xpath("//h2"));
	 int count=headings.size();
	 for(int i=0;i<count;i++)
	 {
		 String news = headings.get(i).getText();
		 System.out.println(news);
	 }
		
		

	}

}
