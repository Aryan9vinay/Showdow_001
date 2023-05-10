package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE THE SCRIPT TO LOGIN TO ACTITIME BY TAKING DATA FROM THE PROPERTY FILE

public class HandlingActiTimePropertyFile {
static{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
		// TO open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the actime url
		driver.get("https://demo.actitime.com/login.do");
		//get java representative object of the physical file
		FileInputStream file = new FileInputStream("./data/actime.property"); 
		//create an object of properties class
		Properties p = new Properties();
		//load the file
		p.load(file);
		//get the data(value ) passing key
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("passward");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
