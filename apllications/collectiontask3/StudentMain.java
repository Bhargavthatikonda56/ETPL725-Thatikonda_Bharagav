package com.evergent.corejava.bhargav.application4;

import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args) 
	{
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			StudentInterface s= new StudentImp();
			for(;;)
			{
				System.out.println("1.Add Student");
				System.out.println("2.Search student by id");
				System.out.println("3.All student details");
				System.out.println("4.Exit");
				
				int n=sc.nextInt();
				switch(n)
				{
				   case 1 : System.out.println("Enter Student id : ");
				            int id=sc.nextInt();
				            System.out.println("Enter Student name : ");
				            String name=sc.next();
				            System.out.println("Enter Student branch : ");
				            String branch=sc.next();
				            Student ob=new Student();
				            ob.setid(id);
				            ob.setName(name);
				            ob.setbranch(branch);
				            s.addstudent(ob);
				            break;
				   case 2 : System.out.println("Enter student id : ");
				            int id1=sc.nextInt();
				            s.searchbyid(id1);
				            break;
				   case 3 : s.getallstudents();
				            break;
				   case 4 : System.exit(0);   
				}
			}
		}

	}


}
