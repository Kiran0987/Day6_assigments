package com.practice.logicalprograms;

public class Reverse_of_Number {
	public static void main(String[] args)   
	{  
		int number = 421, reverse = 0;  
		while(number != 0)   
		{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  
