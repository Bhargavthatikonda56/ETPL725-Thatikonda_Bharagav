package com.evergent.corejava.exceptions;

public class ExceptionDemo6 
{
	String name="null";
	int k=2;
	public void myData()
	{
		try {
			 System.out.println("one");
			 System.out.println(name.length());
			 int t=10/k;
			 System.out.println("End"+" "+t);
		 }
		 finally {
			 System.out.println("Finally block for closing the DB/Network connection");
		 }
	}
	public static void main(String[] args) 
	{
		 ExceptionDemo6 ed2=new ExceptionDemo6();
		 ed2.myData();
	}
}
