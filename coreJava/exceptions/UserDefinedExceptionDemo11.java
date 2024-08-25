package com.evergent.corejava.exceptions;
class InsufficientFundException extends Exception{
	public InsufficientFundException (String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo11 {
    public static void withdraw(int Amount) throws InsufficientFundException{
    	if(Amount>500)
    	{
    		throw new InsufficientFundException("Insufficient Balance in your Account");
    	}
    	else
    	{
    		System.out.println("Transaction is successfull");
    	}
    	
    }
	public static void main(String[] args) 
	{
		   try 
		   {
			   withdraw(600);
		   }
		   catch(InsufficientFundException e)
		   {
			   System.out.println("caught the exception : "+e.getMessage());
			   System.out.println(e);
		   }
		   System.out.println("program continues after handling the exception");

	}

}
