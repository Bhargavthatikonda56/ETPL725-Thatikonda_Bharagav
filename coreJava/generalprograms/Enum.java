package com.evergent.corejava.generalprograms;
import java.util.Scanner;
public class Enum {
	enum Vechile{
		CAR,
		BIKE,
		TRAIN
	}

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			String name=sc.nextLine();
			System.out.print(Vechile.valueOf(name));
		}
	}

}
