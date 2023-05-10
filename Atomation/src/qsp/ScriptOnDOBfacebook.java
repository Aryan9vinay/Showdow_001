package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//write  a script on facebook on date of birth

public class ScriptOnDOBfacebook {
static {System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		
//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.facebook.com/");
		//in sign up page go to create new account botton and click
		driver.findElement(By.linkText("Create new account")).click();
		//in Sign up page go date of birth section and select the date of birth in listbox of date ,month and year
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select S1=new Select(day);
		 S1.selectByValue("28");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select S2=new Select(month);
		S2.selectByVisibleText("May");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		//create three objects of Select class and pass the argument refVar of webElement of day,month,year
		
         Select S3=new Select(year);
		S3.selectByValue("1991");
	}

}
