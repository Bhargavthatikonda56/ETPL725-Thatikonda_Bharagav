package com.evergent.corejava.exceptions;

public class ExceptionDemofinally2 {
	String name="null";
	int k=2;
	public void myData()
	{
		try {
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t+" End");
		}
		finally
		{
			System.out.println("Finally Block for clossing db & network connections");
			
		}
	}

	public static void main(String[] args) 
	{
		ExceptionDemofinally2 em=new ExceptionDemofinally2();
		em.myData();

	}

}
