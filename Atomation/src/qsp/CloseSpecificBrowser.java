package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WRITE A SCRIPT TO CLOSE ONLY SPECIFIC BROWSER

public class CloseSpecificBrowser {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
			//Enter the URL
		System.out.println("Enter the Browser to be closed ");
		try (Scanner sc = new Scanner(System.in)) {
			String Extitle=sc.nextLine();
			// TO open the browser
				WebDriver driver=new ChromeDriver();	
				driver.get("https://secure.indeed.com/");
				Thread.sleep(3000);
				driver.findElement(By.id("apple-signin-button")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
				Set<String> wh = driver.getWindowHandles();
				int count=wh.size();
				System.out.println(count);
				for(String h:wh)
				{
					System.out.println(h);
					 driver.switchTo().window(h);
					 String Dtitle = driver.getTitle();
					System.out.println(Dtitle);
					if(Dtitle.contains(Extitle))
					{
						driver.close();
					}
					
				}
		}
			
	

	}

}
