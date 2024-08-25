package com.evergent.corejava.static1;

public class StaticDemo2 {
	static String ename="India";
	       String name="Bhargav";
    static public void mydata()
    {
    	 System.out.println("my data");
    }
    public void show()
    {
    	System.out.println("This is Non static method");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		mydata();
		System.out.println(ename);
	}

}
