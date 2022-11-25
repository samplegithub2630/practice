package com.test.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SerialExecution {
	
	@Test
	public void test1() throws InterruptedException {
		
		System.out.println("Test1= " +Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		driver.close();
		
	}
	
	@Test
	public void test2() throws InterruptedException {
			
			System.out.println("Test2= " +Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium08.blogspot.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);	
			driver.close();
			
		}
	
	

}
