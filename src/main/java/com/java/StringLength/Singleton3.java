package com.java.StringLength;

final class Singleton3 {
	
	public static  Singleton3 s=null;
	public String str="Jobbers Cafe";
	
	private Singleton3()
	{
		
	}
	final static Singleton3 getInstance()
	{
		if(s==null)
			s=new Singleton3();
		return s;
		
	}

}
