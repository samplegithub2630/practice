package com.Grouping;

import org.testng.annotations.Test;

public class Mobile {
	
	@Test
	public void realme() {
		
		System.out.println("my realme mobile");
	}
	
	@Test(groups = {"sanity"})
	public void vivo() {

		System.out.println("my vivo mobile");
	}

}
