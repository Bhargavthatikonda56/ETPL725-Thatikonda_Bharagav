package com.evergent.corejava.static1;


public class StaticDemo1 {
     static String ename="Bhargav";
     static public void mydata()
     {
    	 System.out.println("my data");
     }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(StaticDemo1.ename);
		StaticDemo1.mydata();
	}
}
