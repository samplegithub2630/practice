package com.Grouping;

import org.testng.annotations.Test;

public class Laptop {

	@Test(groups ={"sanity","smoke"})
	public void dell() {
		
		System.out.println("my dell laptop");
	}
	
	@Test
	public void lenovo() {
		
		System.out.println("my lenovo laptop");
	}
}
