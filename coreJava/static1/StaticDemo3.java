package com.evergent.corejava.static1;

public class StaticDemo3 {
	static String ename="India";
    String name="Bhargav";
    static public void mydata()
   {
	  System.out.println("my data");
   }
   public void show()
   {
	   mydata();
	  System.out.println("This is Non static method");
   }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		mydata();
		System.out.println(ename);
		StaticDemo3 sd4=new StaticDemo3();
		sd4.show();
	}

}
