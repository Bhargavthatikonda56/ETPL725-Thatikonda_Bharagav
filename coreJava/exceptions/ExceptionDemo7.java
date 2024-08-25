package com.evergent.corejava.exceptions;

public class ExceptionDemo7 {
    String name=null;
    int k=2;
    public void myData() throws NullPointerException{
    	System.out.println("one");
    	System.out.println(name.length());
    	int t=10/k;
    	System.out.println("End "+t);
    }
	public static void main(String[] args) {
		try {
			ExceptionDemo7 dm=new ExceptionDemo7();
			dm.myData();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
