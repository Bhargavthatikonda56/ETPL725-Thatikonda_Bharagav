package com.evergent.corejava1.application5;

public class AdultUser implements LibraryUser
{
	int age;
	String bType;
	public void registerAccount(int age) throws AgeLimitException
	{
		if(age<12)
		{
			throw new AgeLimitException("Sorry, Age must be greater than 12 to register as an adult");
		}
		else
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
	}
	public void requestBook(String btype) throws NotValidBookException
	{
		if(btype.equals("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			throw new NotValidBookException("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
