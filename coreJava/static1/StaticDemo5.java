package com.evergent.corejava.static1;

public class StaticDemo5 {

	static  String name="Raju"; //
    int age=28;
    String address="Hyderabad";
    
    public void display() {
		name="Welcome";
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Address :"+address);
	}
	public static void main(String[] args) 
	{
		StaticDemo5  p1=    new StaticDemo5();
		System.out.println(StaticDemo5.name);
		p1.display();
		
        System.out.println(StaticDemo5.name);

	}

}
