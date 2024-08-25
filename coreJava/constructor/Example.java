package com.evergent.corejava.constructor;
class Main{
	String name;
	int age;
	Main(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	void Display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
public class Example {
	public static void main(String[] args) 
	{
		Main M=new Main("ABC",50);
		M.Display();
	}
}
