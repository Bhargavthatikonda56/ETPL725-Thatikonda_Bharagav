package com.evergent.corejava.employee;

import java.util.Scanner;
public class MainController {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int empid;
		String name;
		float exp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Employee name : ");
		name=sc.next();
		System.out.println("Enter Employee experiance : ");
		exp=sc.nextFloat();
		EmployeeService emp=new EmployeeService();
		int updatedresult=emp.addEmployeeService(empid, name, exp);
		System.out.println("Inserted :"+updatedresult+" record Bhargav Success");
	}

}
