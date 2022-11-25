package com.java.StringLength;

public class Singleton4 {
	
	public static  Singleton4 s=null;
	public String str="Jobbers Cafe";
	
	private Singleton4()
	{
		
	}
	final static Singleton4 getInstance()
	{
		if(s==null)
			s=new Singleton4();
		return s;
		
	}

}
