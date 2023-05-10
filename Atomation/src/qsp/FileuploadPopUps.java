package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE THE SCRIPT OF FILEUPLOADPOPUPS

public class FileuploadPopUps {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// to open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/rsume.html");
		Thread.sleep(3000);
		File f=new File("./data/Resume.docx");
		String absolutePath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
		

	}

}
