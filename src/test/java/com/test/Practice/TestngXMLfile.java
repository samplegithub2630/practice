package com.test.Practice;

import org.testng.annotations.Test;

public class TestngXMLfile {
	
	@Test(groups = {"smoke"})
	public void test1() {
		
		System.out.println("test1 is execute");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2 is execute");
	}


}
