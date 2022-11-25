package com.java.StringLength;

public class SLength {

	public static void main(String[] args)throws Exception{
		
		String str="Bug Hunters Batch7";
		int i=0;
		for(char c:str.toCharArray())
		{
			i++;
		}
		System.out.println("Length of the given string is : " +i);

	}

}
