package com.evergent.corejava.constructor;
class Animal{
	private String name;
	private int age;
	public Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void Display() {
		System.out.println(name);
		System.out.println(age);
	}
}
class Dog extends Animal{
	String breed;
	public Dog(String name,int age,String breed)
	{
		super(name,age);
		this.breed=breed;
	}
	public void Display()
	{
		super.Display();
		System.out.println(breed);
	}
}
public class Inheritance_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog("Buddy",5,"Golden Retriever");
		dog.Display();
	}

}
