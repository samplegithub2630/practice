package com.java.BH;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			WebElement source=driver.findElement(By.xpath(" //a[text()='Demo Dropdown List']"));
			WebElement dest=driver.findElement(By.xpath("//a[text()='Demo Dropdown List']"));
			
			act.moveToElement(source).build().perform();
			Thread.sleep(5000);
			act.clickAndHold().perform();
			Thread.sleep(5000);
			act.moveToElement(dest).build().perform();
			act.release();
			Thread.sleep(5000);
			driver.close();
		
			

	}

}
