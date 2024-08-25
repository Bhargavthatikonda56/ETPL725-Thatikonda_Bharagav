package com.evergent.corejava1.bhargav.application4;

public abstract class CustomerBookingDetails 
{
	abstract public void BookingStatus(boolean ans);
	public  CustomerBookingDetails ()
	{
		System.out.println("\t\t\tWelcome to Bing Hotel Rooms ");
	}
	public void HotelDetails()
	{
		System.out.println("Room price information is : ");
		System.out.println();
		System.out.println("If max people are 3 the price is 1000 per day");
		System.out.println("If max people are more then 3 the price is 1500 per day");
	}
	
}
