package com.evergent.corejava.constructor;
class car{
	String color;
	int maxspeed;
	car()
	{
		color="white";
		maxspeed=120;
	}
	car(String color,int maxspeed)
	{
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void Display()
	{
		System.out.println(color);
		System.out.println(maxspeed);
	}
}
public class MyCars7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car("Red",150);
		c1.Display();
		c2.Display();

	}

}
