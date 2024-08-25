package com.evergent.corejava.oops;

class MyBigData{
	public void mydata(int a)
	{
		System.out.println("My Big Data : class method");
	}
}
public class MethodOverridding extends MyBigData
{

	public void mydata()
	{
		System.out.println("My data");
	}
	public void show()
	{
		System.out.println("Local new method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridding  cl=new MethodOverridding ();
		cl.mydata(5);
		cl.show();
	}

}
