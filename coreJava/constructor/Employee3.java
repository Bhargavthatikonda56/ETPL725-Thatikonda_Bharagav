package com.evergent.corejava.constructor;
public class Employee3
{
	int eno;
	String ename;
	double sal;
	Employee3(int eno,String ename,double sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	private void Display()
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
	}
	

	public static void main(String[] args) 
	{
		 Employee3 emp3=new Employee3(25,"Bhargav",26000); 
		 emp3.Display();
	}
}
