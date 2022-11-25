package com.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshots {
	public WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\LENOVO/Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Maven123\\ScreenShots\\Screen1.png"));
		System.out.println("My test case pass");
			
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		Assert.assertTrue(false);
		System.out.println("My test case fail");
		
	}
	
	public void test3() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\LENOVO/Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Maven123\\ScreenShots\\Screen3.png"));
				
		System.out.println("My test case pass");
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\LENOVO/Documents\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\Maven123\\ScreenShots\\"  +result.getName()+ ".png"));
		System.out.println("**********Name********" +result.getName());
			
		}	
	}	
}
