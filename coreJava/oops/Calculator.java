package com.evergent.corejava.oops;

public class Calculator {
	public void show()
	{
		System.out.println("No parameter NO return type");
	}
	public void mydata(double a,int b)
	{
		System.out.println(a+b);
	}
	public int mymul(int a,int b)
	{
		return a*b;
	}
	public int mychange() {
		return 100;
	}

	public static void main(String[] args) 
	{
		Calculator cf=new Calculator();
		cf.show();
		cf.mydata(10.5,20);
		System.out.println(cf.mymul(5, 2));
		cf.mychange();
		

	}

}
