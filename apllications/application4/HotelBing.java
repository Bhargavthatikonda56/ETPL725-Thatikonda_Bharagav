package com.evergent.corejava1.bhargav.application4;

import java.util.Scanner;
public class HotelBing
{
	 static double price;
     static boolean ans;
	Scanner sc = new Scanner(System.in);
	public HotelBing()
	{
		System.out.println("======================");
		System.out.println(" Hotel Bing Main Menu");
		System.out.println("======================");
		System.out.println("B-Booking Module");
		System.out.println("P-Payment Module");
		System.out.println("R-Report Module");
		System.out.println("E-Quit Module");
		System.out.println("======================");
	    System.out.println("Enter your Module code (B,P,R,E) : ");
	}
	public HotelBing(int n,int d)
	{
		price=d*1000;
		if(n<=3)
		{
			System.out.println("Your total price is : "+price);
		}
		else if(n>3 & n<=5)
		{
			price=price*1.5;
			System.out.println("Your total price is : "+price);
		}	
	}
	public void HotelBing1()
	{
		System.out.println("Your total price is : "+price);
    	System.out.println("Enter 1 to processed with the payment");
    	System.out.println("Enter 2 to cancel the payment");
    	int i=sc.nextInt();
    	if(i==1)
    	{
    		System.out.println("Your payment is processed...");
    		ans=true;
    	}
    	else
    	{
    		System.out.println("Your payment is cancelled...");
    		ans=false;
    	}
	}
	public static final void Hotel()
	{
		System.out.println("Thank you for choosing Bing Hotel Rooms");
	}
}
