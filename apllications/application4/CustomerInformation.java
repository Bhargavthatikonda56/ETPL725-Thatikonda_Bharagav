package com.evergent.corejava1.bhargav.application4;
import java.util.Scanner; 

public class CustomerInformation extends CustomerBookingDetails implements CustomerInterface
{
	String age;
	String name;
	String Address;
	String Aadharno;
	public void customerInfo(String name,String age)
	{
		this.age=age;
		this.name=name;
	}
	public void customerAddress(String Address,String Aadharno)
	{
		  this.Address=Address;
		  this.Aadharno=Aadharno;
	}
	public void customerDetails()
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Age : "+age);
		System.out.println("Customer Address : "+Address);
		System.out.println("Customer Aadharno : "+Aadharno);
	}
	public void BookingStatus(boolean ans)
	{
		 if(ans)
		 {
			 System.out.println("Your Booking is confirmed....and payment processed");
			 
		 }
		 else
		 {
			 System.out.println("Your booking is canceled....");
			
		 }
	}
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println();
			int d,n;
			CustomerInformation ob=new CustomerInformation();
			while(true)
			{
				HotelBing H=new HotelBing();
			    String str=sc.nextLine();
			    switch(str)
			    {
			    case "B": 
			    	System.out.println("Enter your name");
			    	String Name = sc.nextLine();
			    	System.out.println("Enter your age");
			    	String age=sc.nextLine();
			    	System.out.println("Enter your Address");
			    	String Address=sc.nextLine();
			    	System.out.println("Enter your Aadharno");
			    	String Aadharno=sc.nextLine();
			    	ob.customerInfo(Name, age);
			    	ob.customerAddress(Address, Aadharno);
			    	ob.HotelDetails();
			    	System.out.println("Enter no of days : ");
					d=Integer.parseInt(sc.nextLine());
					System.out.println("Enter no of people : ");
					n=Integer.parseInt( sc.nextLine());
					new HotelBing(n,d);
					break;
			    case "P":
			    	H.HotelBing1();
			    	break;
			    case "R":
			    	System.out.println("======================");
					System.out.println(" Hotel Bing Report ");
					System.out.println("======================");
			    	ob.BookingStatus(HotelBing.ans);
			    	if(HotelBing.ans)
			    	{
			    	  ob.customerDetails();
			    	  System.out.println("Amount paid : "+HotelBing.price);
			    	}
			    	HotelBing.Hotel();
			    	break;
			    case "E":
			    	System.out.println("Quit Module");
			    	System.exit(0);
			    	break; 	
			    }
			}
		}
	}	
}
