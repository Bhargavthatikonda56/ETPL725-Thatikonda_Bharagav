package com.evergent.corejava.casestudyhashmap;

import java.util.Scanner;
import java.util.HashMap;
public class EmployeeImp {
	HashMap<Integer, Employee> map = new HashMap<>();
	public void addEployee(Employee b)
	{
		if(map.containsKey(b.getId()))
		{
			System.out.println("Employee id is already there");
		}
		else
		{
			map.put(b.getId(), b);
			System.out.println("Employee details updated");
		}
	}
	public void retriveEmpbyid(int id)
	{
		if(map.containsKey(id))
		{
			System.out.println(map.get(id));
		}
		else
		{
			System.out.println("Employee details are not there");
		}
	}
	public void updateEmp(int id)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select 1 to update Name ");
		System.out.println("select 2 to update Department");
		System.out.println("select 3 to update Both");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter name to update : ");
			map.get(id).setName(sc.next());
			break;
		case 2:
			System.out.println("Enter Department to update : ");
			map.get(id).setDept(sc.next());
			break;
		case  3:
			System.out.println("Enter name to update : ");
			map.get(id).setName(sc.next());
			System.out.println("Enter Department to update : ");
			map.get(id).setDept(sc.next());
			break;
		}
		System.out.println("Employee Details updated...");
	}
	public void removeEmp(int id)
	{
		map.remove(id);
		System.out.println("Employee Details are removed...");
	}
	public void retriveEmp()
	{
		for (Integer key : map.keySet()) {
		      System.out.println(map.get(key));
		}
	}
}
