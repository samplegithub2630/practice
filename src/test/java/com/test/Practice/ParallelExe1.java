package com.test.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExe1 {
	
	@Test
	public void testThree() throws InterruptedException {
		
		System.out.println("Test Three= " +Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.close();
		
	}
	
	@Test
	public void testFive() throws InterruptedException {
		
		System.out.println("Test Five= " +Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.close();
		
	}
	
		

}
