package com.java.StringLength;

public class Singleton2 {
	
	public static  Singleton2 s=null;
	public String str="Jobbers Cafe";
	
	private Singleton2()
	{
		
	}
	final static Singleton2 getInstance()
	{
		if(s==null)
			s=new Singleton2();
		return s;
		
	}

}
