package com.java.BH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://text-compare.com/");
				driver.manage().window().maximize();

				Actions act = new Actions(driver);

//				//act.sendKeys(Keys.ENTER).perform();
//				act.sendKeys("A").perform();
//				Thread.sleep(3000);
				
				WebElement box1 =  driver.findElement(By.xpath("//textarea[@id='inputText1']"));
				WebElement box2 =  driver.findElement(By.xpath("//textarea[@id='inputText2']"));
				box1.sendKeys("hellow world");

				//ctl+A
				act.keyDown(Keys.CONTROL);
				act.sendKeys("A");
				act.keyUp(Keys.CONTROL);
				act.perform();
				Thread.sleep(3000);
				
				//ctl+C
				act.keyDown(Keys.CONTROL);
				act.sendKeys("C");
				act.keyUp(Keys.CONTROL);
				act.perform();
				Thread.sleep(3000);
				//press� TAB
				act.sendKeys(Keys.TAB);
				act.perform();
				
				//ctl+V
				System.out.println("Hi 1");
				act.keyDown(Keys.CONTROL);
				act.sendKeys("V");
				act.keyUp(Keys.CONTROL);
				act.perform();
				Thread.sleep(3000);
				System.out.println("Hi 1");
						

	}

}
