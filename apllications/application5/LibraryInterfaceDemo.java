package com.evergent.corejava1.application5;
import java.util.*;
public class LibraryInterfaceDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t****Welcome to library Book management****");
		System.out.println("Enter the user type : ");
		System.out.println("1.KidUser");
		System.out.println("2.AdultUser");
		System.out.println("choose your option (1,2) : ");
		int N=sc.nextInt();
		System.out.println("Enter You Age : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter The Book Category You Want Choose(Kids,Fiction) : ");
		String bType= sc.nextLine();
		try {
			switch(N) {
			case 1:
				KidUsers ku=new KidUsers();
				ku.registerAccount(age);
				ku.requestBook(bType);
				break;
			case 2:
				AdultUser au=new AdultUser();
				au.registerAccount(age);
				au.requestBook(bType);
				break;
			default:
				System.out.print("Invalid Choice");
				break;
				}
			}
			catch(Exception e) {
				    System.out.println(e);
					System.out.print(e.getMessage());
				}	
	}
}
