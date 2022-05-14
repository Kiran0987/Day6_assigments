package com.practice.logicalprograms;



public class Fibonacci_Series {
	 public static void main(String[] args) 
	    {
	        int n = 9, a = 0, b = 0, c = 1;
	        System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }
}
