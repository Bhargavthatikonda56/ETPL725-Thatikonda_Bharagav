package com.evergent.corejava.exceptions;

public class ExceptionDemo3 {

	String name=null;
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
	}
	public static void main(String[] args) 
	{
		 ExceptionDemo3 ed2=new ExceptionDemo3();
		 ed2.myData();
	}

}
