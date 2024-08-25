package com.evergent.corejava.oops;
class Myperson
{
	public void personInfo()
	{
		System.out.println("Bhargav");
	}
}
class Adderss extends Myperson
{
	public void personadd()
	{
		System.out.println("Hyderabad");
	}
}

public class MultiLevelInheritance extends Adderss{
	public void show()
	{
		System.out.println("Local Methods");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.personInfo();
		mi.personadd();
		mi.show();
		Calculator c=new Calculator();
		c.show();
		

	}

}
