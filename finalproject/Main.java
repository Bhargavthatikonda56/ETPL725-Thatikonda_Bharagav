package com.evergent.corejava.bhargav.finalproject;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int id,rn;
		String name,cn; 
		try (Scanner s = new Scanner(System.in)) 
		{
			HotelService hs=new HotelService();
			System.out.println("\n\t\t\tHOTEL MANAGEMENT SYSTEM");
			while(true)
			{
				 System.out.println("1. Reserve a room ");
			     System.out.println("2. View Reservation Details by guest id ");
			     System.out.println("3. Update Reservation Details");
			     System.out.println("4. Cancel Reservation");
			     System.out.println("5. Exit");
			     System.out.print("Choose an option: ");
			     
				 int ch=s.nextInt();
				 switch(ch)
				 {
				  case 1:
					  System.out.println("Enter guest id : ");
					  id=s.nextInt();
					  System.out.println("Enter guest name : ");
					  name=s.next();
					  System.out.println("Enter room No : ");
					  rn=s.nextInt();
					  System.out.println("Enter contact no : ");
					  cn=s.next();
					  int updateCount =hs.reserveHotel(id, name, rn, cn);
					  System.out.println(updateCount+" Hotel Room reserved successfully");
					  break;
				  case 2:
					  System.out.println("Enter guest id : ");
					  id=s.nextInt();
					  hs.viewResDetails(id);
					  break;
				  case 3:
					  System.out.println("Enter id to update details : ");
					  id=s.nextInt();
					  hs.updateDetails(id);
					  break;
				  case 4:
					  System.out.println("Enter your guest id which need to be canceled : ");
					  id=s.nextInt();
					  int re=hs.cancelRes(id);
					  if (re>0) 
					  {
			                System.out.println("Reservation canceled successfully!");
					  } 
					  else   
					  {
			                System.out.println("Reservation cancelation failed.");
			          }
					  break;
					  
				  case 5:
					  System.exit(0);
				 }
				
			}
		}
	}

}
