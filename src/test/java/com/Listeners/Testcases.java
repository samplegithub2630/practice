package com.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)
public class Testcases {
	
	@Test
	public void test1() {
		System.out.println("Test case is pass");	
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
		System.out.println("Test case is fail");
		
	}

}
