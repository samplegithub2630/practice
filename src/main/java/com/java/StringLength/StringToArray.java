package com.java.StringLength;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToArray {

	public static void main(String[] args) {
		
		String str="My name is ABCD";
		String[] words=str.split(" ");
		System.out.println(Arrays.toString(words));
		Pattern pattern=Pattern.compile(" ");
		words=pattern.split(str);
		System.out.println(Arrays.toString(words));

	}

}
