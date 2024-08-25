package com.evergent.corejava.abstract1;

public class ProductsImpl1 extends Product{
	public void show()
	{
		System.out.println("Local show method");
	}
	public  ProductsImpl1()
	{
		System.out.println("This is subclass constructor");
	}
    public void newproduct()
    {
    	System.out.println("My new product");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductsImpl1 P1 =  new  ProductsImpl1();
		//P1.show();
		
		P1.newproduct();
		P1.allproducts();
		P1.show();
	}

}
