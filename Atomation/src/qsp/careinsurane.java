package qsp;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Verify the text "Please enter valid Pollicy no is Dispalyed or not
public class careinsurane {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.id("dob")).click();
		WebElement monthlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(monthlistbox);
		s1.selectByIndex(4);
		Thread.sleep(3000);
		WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(yearlistbox);
		s2.selectByIndex(10);
		driver.findElement(By.xpath("//a[text()='8']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		
		String text = driver.findElement(By.id("policynumberError")).getText();
		//Alert a = driver.switchTo().alert();
		//String text = a.getText();
	boolean b = text.equalsIgnoreCase("Please enter valid Policy No.");
		if(b)
		{
			System.out.println("alert is :" +b);
		}
		else
		{
			System.out.println("alert is :" +b);
		}
	}
}
