package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListnerImplimentationClass extends BaseClass implements ITestNGListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshot/"+res+".png");
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			
		}

}