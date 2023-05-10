package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WRITE A SCRIPT TO PRINTN THE FIRST SELECT OPTION PRESENT IN CHECKPOST
public class PrintFirstSelectOption {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Hp/Desktop/selenium%20HTML/cuisine.html");
		//find the element in checkPost
		Thread.sleep(3000);
	   WebElement checkPost = driver.findElement(By.id("cp"));
	   //create an object of select class of support.ui package
	   Select s=new Select(checkPost);
	   List<WebElement> AllfsOption = s.getAllSelectedOptions();
	   int count=AllfsOption.size();
	   for(int i=0;i<count;i++)
	   {
		   String text = AllfsOption.get(i).getText();
		   System.out.println(text);
	   }
	   Thread.sleep(3000);
	   Select s1=new Select(checkPost);
	   WebElement fsOption = s1.getFirstSelectedOption();
	   String txt = fsOption.getText();
	   System.out.println(txt);

driver.close();
	}

}
