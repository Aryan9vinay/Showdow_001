package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Write to login into Naukari.com and upload your Resume in it.

public class FileUploadInNaukariCom {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://www.naukri.com/");
		//Synchronization
		Thread.sleep(3000);
		//find the login
		driver.findElement(By.id("login_Layer")).click();
		//Enter the user name
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("vinaysinghmit@yahoo.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("singhisking");
		 driver.findElement(By.xpath("//button[text()='Login']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		 File f=new File("./data/Resume.docx");
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		Thread.sleep(5000);
		 //driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys("absolutePath");
		 
		driver.findElement(By.id("attachCV")).sendKeys(absolutePath);

	}

}
