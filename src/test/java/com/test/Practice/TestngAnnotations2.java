package com.test.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngAnnotations2 {

	@DataProvider(name="testdata")
	public Object[][] name(){
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="akshay";
		obj[0][1]="bhagwat";
		obj[1][0]="snehal";
		obj[1][1]="gangotri";
		
		return obj;	

	}
	
	@Test(dataProvider = "testdata")
	public void name(String name,String clgname) {
		
		System.out.println(name);
		System.out.println(clgname);
	}

}
