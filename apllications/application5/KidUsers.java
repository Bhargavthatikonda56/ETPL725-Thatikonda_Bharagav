package com.evergent.corejava1.application5;

class AgeLimitException extends Exception
{
	public AgeLimitException(String msg)
	{
		super(msg);
	}
}
class NotValidBookException extends Exception
{
	public NotValidBookException(String msg)
	{
		super(msg);
	}
}
public class KidUsers implements LibraryUser
{
	int age;
	String bType;
	public void registerAccount(int age) throws AgeLimitException
	{
		if(age>12)
		{
			throw new AgeLimitException("Sorry, Age must be less than 12 to register as a kid");
		}
		else
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
	}
	public void requestBook(String btype) throws NotValidBookException
	{
		if(btype.equals("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			throw new NotValidBookException("Oops, you are allowed to take only kids books");
		}
	}
}
