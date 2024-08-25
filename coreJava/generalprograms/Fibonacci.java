package com.evergent.corejava.generalprograms;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0,b=1,c,n=2;
		if(n>=1)
		{
			System.out.print(a);
		}
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
