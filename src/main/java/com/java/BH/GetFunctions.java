package com.java.BH;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctions {
	WebDriver driver;

	@Test (priority=1)
	public void testcase1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Current URL = " +driver.getCurrentUrl());
		System.out.println("Get Title = " +driver.getTitle());
		//String documentText = "Facebook-log in or sign up";
		//String pageText = driver.getTitle();
	
	//	Assert.assertEquals(pageText, documentText);
		
		driver.close();
		
	}
	
	@Test(priority=2)
	public void test2() {
		
		System.out.println("Test case 2");
	}
	
	@Test (priority=3)
	public void test3() {
		
		System.out.println("Test case 3");
	}
	
}
