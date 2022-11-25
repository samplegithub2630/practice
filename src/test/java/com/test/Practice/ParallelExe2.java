package com.test.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExe2 {
	

	@Test
	public void testFour() throws InterruptedException {
			
			System.out.println("Test Four= " +Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium08.blogspot.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);	
			driver.close();
			
	}
			

}
