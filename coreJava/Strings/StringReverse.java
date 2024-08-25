package com.evergent.corejava.Strings;

public class StringReverse {

	public static void main(String[] args) 
	{
		String str="Hello , World";
		StringBuilder reversed=new StringBuilder(str).reverse();
		System.out.println(reversed);

	}

}
