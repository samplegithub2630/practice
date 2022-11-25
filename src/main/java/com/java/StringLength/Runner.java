package com.java.StringLength;


public class Runner {

		public static void main(String[] args) 
		{
			Singleton1 s= Singleton1.getInstance();
			System.out.println(s.str);
			Singleton1 s4= Singleton1.getInstance();
			System.out.println(s4.str.toUpperCase());
			System.out.println(s4.str);
			s4.str=(s4.str.toUpperCase());
			System.out.println(s4.str);
			System.out.println(s.str);
		}
		
		

	
}
