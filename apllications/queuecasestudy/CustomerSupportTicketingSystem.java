package com.evergent.corejava.casestudy;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
public class CustomerSupportTicketingSystem 
{
	Deque<String> deque = new ArrayDeque<>();
	void addTicket(String ticket)
	{
		deque.add(ticket);
		System.out.println("Ticket added");
	}
	void processNextTicket()
	{
		if(deque.size()>0)
		{
			System.out.println(deque.poll()+" ticket is processed");
		}
		else
		{
			System.out.println("There are no next tickets...");
		}
	}
	void peekNextTicket()
	{
		System.out.println(deque.peek()+" is the next ticket");
	}
	void displayQueue()
	{
		System.out.println(deque);
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("\t\t   Welcome to customer ticket supp");
			CustomerSupportTicketingSystem ob=new CustomerSupportTicketingSystem();
			for(;;)
			{
				    System.out.println("1.Add a ticket to the queue");
				    System.out.println("2.Processes the next ticket in the queue.");
				    System.out.println("3.Checks the next ticket.");
				    System.out.println("4.Displays all tickets currently in the queue.");
				    System.out.println("5.Exit");
				    int n=sc.nextInt();
				    switch(n)
				    {
				    case 1:System.out.println("Enter the ticket id : ");
				           String ticket=sc.next();
				           ob.addTicket(ticket);
				           break;
				    case 2:ob.processNextTicket();
				           break;
				    case 3:ob.peekNextTicket();
				           break;
				    case 4:ob.displayQueue();
				           break;
				    case 5: System.exit(0); 	
				    }
			}
		}
		
	}

}
