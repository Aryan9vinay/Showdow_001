package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//get the java representative object of the physical file
		FileInputStream fs=new FileInputStream("./data/actime.property");
//create object of properties file
		Properties p=new Properties();
		p.load(fs);
		String ur = p.getProperty("url");
		String user = p.getProperty("username");
		String pwd = p.getProperty("passward");
		driver.get(ur);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//	System.out.println(ur);
	//	System.out.println(user);
	//	System.out.println(pwd);
		
		
	}

}
