package com.evergent.corejava.exceptions;
class InvalidAgeException  extends Exception{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo10 {
    public static void checkAge(int Age) throws InvalidAgeException{
    	if(Age<18)
    	{
    		throw new InvalidAgeException("Age must be 18 or old");
    	}
    	else
    	{
    		System.out.println("Access granted you are old enough");
    	}	
    }
	public static void main(String[] args) 
	{
		   try 
		   {
			   checkAge(16);
		   }
		   catch(InvalidAgeException e)
		   {
			   System.out.println("caught the exception : "+e.getMessage());
			   System.out.println(e);
		   }
		   System.out.println("program continues after handling the exception");

	}
}
