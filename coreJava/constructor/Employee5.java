package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String ename;
	double sal;
	Employee5(int eno)
	{
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal)
	{
		 this(eno);
		 this.ename=ename;
		 this.sal=sal;
	}
	public void Display()
	{
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(sal);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee5 emp5=new Employee5(25,"Bhargav",26000);
		emp5.Display();
		

	}

}
