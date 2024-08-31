package com.evergent.corejava1.application5;

public interface LibraryUser {
	public void registerAccount(int age) throws AgeLimitException;
	public void requestBook(String btype) throws NotValidBookException;

}
