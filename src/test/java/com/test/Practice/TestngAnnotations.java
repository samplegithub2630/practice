package com.test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAnnotations {

	WebDriver driver;
	@BeforeSuite
	public void before() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(null);
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='email]")).sendKeys("Jobberscafe");
		Thread.sleep(5000);
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='pass]")).sendKeys("2630");
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void after() {
		
		driver.close();
	}
	

}
