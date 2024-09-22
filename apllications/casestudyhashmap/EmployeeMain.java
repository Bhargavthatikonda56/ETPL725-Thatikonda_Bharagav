package com.evergent.corejava.casestudyhashmap;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int id;
		Scanner sc = new Scanner(System.in);
		EmployeeImp obj=new EmployeeImp();
        System.out.println("\n\t\t\t****Employee Management System****");
        for(;;)
        {
        	  System.out.println("1. Add new employee.");
        	  System.out.println("2. Retrieve employee details using their unique ID.");
        	  System.out.println("3. Update employee information.");
        	  System.out.println("4. Remove employees from the system.");
        	  System.out.println("5. List all employees.");
        	  System.out.println("6.Exit");
        	  System.out.println("Enter your choice....");
        	  int n=sc.nextInt();
        	  switch(n)
        	  {
        	  case 1:
        		  System.out.println("Enter the Employee id : ");
        		  id=sc.nextInt();
        		  System.out.println("Enter the Employee name : ");
        		  String name=sc.next();
        		  System.out.println("Enter the Employee dept : ");
        		  String dept=sc.next();
        		  Employee b=new Employee();
        		  b.setId(id);
        		  b.setName(name);
        		  b.setDept(dept);
        		  obj.addEployee(b);
        		  break;
        	  case 2:
        		  System.out.println("Enter the Employee id : ");
        		  id=sc.nextInt();
        		  obj.retriveEmpbyid(id);
        		  break;
        	  case 3:
        		  System.out.println("Enter the Employee id which need to be update : ");
        		  id=sc.nextInt();
        		  obj.updateEmp(id);
        		  break;
        	  case 4:
        		  System.out.println("Enter the Employee id which need to be remove : ");
        		  id=sc.nextInt();
        		  obj.removeEmp(id);
        		  break;
        	  case 5:
        		  obj.retriveEmp();
        		  break;
        	  case 6:
        		  System.exit(0);
        	  }
        }
        
	}
}
