package com.evergent.corejava.exceptions;

public class ExceptionDemo4 
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
		 catch(NullPointerException e)
		 {
			 System.out.println("I can handle : "+e);
		 }
		catch(ArithmeticException e)
		{
			System.out.println("I can handle : "+e);
		}
		catch(Exception e)
		{
			System.out.println("I can handle : "+e);
		}
		finally {
			System.out.println("Finally block for closing the DB/Network connection");
		}
	}
	public static void main(String[] args) 
	{
		 ExceptionDemo4 ed2=new ExceptionDemo4();
		 ed2.myData();
	}
}
