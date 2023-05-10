package qsp;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE THE SCRIPT HIDDENDIVISION OR CALENDER POPUPS
public class HiddenDivisionAndCalenderPopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/login/register");
		Thread.sleep(3000);
		driver.findElement(By.id("policy_or_email")).sendKeys("12345678");
		driver.findElement(By.id("lf_submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("coi_number")).sendKeys("98455098");
		Thread.sleep(3000);
		driver.findElement(By.name("dob")).click();
		Thread.sleep(3000);
		   WebElement dob = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(dob);
		s.selectByIndex(5);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(year);
		s1.selectByValue("1989");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='18']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
		//Alert a = driver.switchTo().alert();
		
		// String t = a.getText();
		//System.out.println(t);
		String text = driver.findElement(By.xpath("//div[text()='Policy Number does not exist. Kindly enter valid Policy Number.']")).getText();
		System.out.println(text);

	}

}
