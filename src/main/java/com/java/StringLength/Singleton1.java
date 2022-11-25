package com.java.StringLength;


public class Singleton1 {
	
	public static  Singleton1 s=null;
	public String str="Jobbers Cafe";
	
	private Singleton1()
	{
		
	}
	final static Singleton1 getInstance()
	{
		if(s==null)
			s=new Singleton1();
		return s;
		
	}

}
