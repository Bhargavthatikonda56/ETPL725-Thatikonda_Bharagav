package com.evergent.corejava.exceptions;
class ProductNotFoundException extends Exception
{
	public ProductNotFoundException(String message) {
		 System.out.println("Hello "+message);
	}
}
public class ProductImplDemo9 {
    int pno=105;
    public void myData() throws ProductNotFoundException
    {
    	if(pno>100)
    	{
    		throw new ProductNotFoundException("This product not There...");
    	}
    	else
    	{
    		System.out.println("Product is There...");
    	}
    }
	public static void main(String[] args) 
	{
		try {
			ProductImplDemo9 pd=new ProductImplDemo9();
			pd.myData();	
		}
		catch(Exception e)
		{
			System.out.println("I can handle : "+e.getMessage());
			System.out.println(e);
		}
	}
}
