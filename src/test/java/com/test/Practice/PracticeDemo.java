package com.test.Practice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeDemo {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite annotations");
	}

	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite annotations");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class annotations");
	}

	@BeforeTest
	public void bef()
	{
		System.out.println("before test annotations");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class annotations");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method annotations");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method annotations");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test annotations");
	}

	@Test
	public void testcase1() {
		
		System.out.println("hello java");
	}
	
	@Test
	public void testcase2() {
		
		System.out.println("i am tester");
	}
	
	@Test
	public void testcase3() {
		
		System.out.println("test case 3 is executed");
		Assert.assertTrue(false);
		
	}
	
	

	

}
