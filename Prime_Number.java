package com.practice.logicalprograms;

public class Prime_Number {
	public static void main(String[] args) {

	    int num = 29;
	    boolean b = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        b = true;
	        break;
	      }
	    }

	    if (!b)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}