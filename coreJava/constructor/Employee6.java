package com.evergent.corejava.constructor;
class MyEmployee
{
	int eno;
    MyEmployee()
	{
		System.out.println("This is super class constructor");
	}
	MyEmployee(int eno)
	{
		System.out.println("Employee No in super class : "+eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;
	String name;
	double sal;
	Employee6(int eno,String name,double sal)
	{
		
		super(eno);
		//super.MyEmployee();
		this.name=name;
		this.sal=sal;
	}
	void Display()
	{
		 System.out.println(name);
		 System.out.println(sal);	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   new MyEmployee();
       Employee6 emp=new Employee6(25,"Bhargav",26000);
       emp.Display();   
       //System.out.println(emp.eno);
	}

}
