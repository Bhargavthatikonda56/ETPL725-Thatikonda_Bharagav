package com.evergent.corejava.generalprograms;



public class Big5{
	public static void main(String[] args) {
		int a=12,b=13,c=15,d=16,e=5;
		 int highest = a;

	        if (b > highest) {
	            highest =b;
	        }
	        if (c> highest) {
	            highest = c;
	        }
	        if (d > highest) {
	            highest =d;
	        }
	        if (e> highest) {
	            highest = e;
	        }

	        
	        System.out.println("The highest number is: " + highest);
	}
	}

