package com.test.Practice;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAnnotations1 {

	@Test(invocationCount = 5)
	public void testcase1() {
		
		System.out.println("*********test case 1************");
		
	}

	@Test
	public void testcase2() {
		
		System.out.println("*********test case 2************");
		Assert.assertTrue(false);
		
	}
	
	
}
