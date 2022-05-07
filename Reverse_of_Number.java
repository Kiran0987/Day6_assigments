package com.practice.logicalprograms;

import java.util.Scanner;

public class Reverse_of_Number {
	static int reverse(int n){

		int rev = 0; // reversed number
		int rem;   // remainder

		while(n>0){

			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}

		return rev;
	}

	public static void main (String[] args) {

		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Reversed Number is "+ reverse(n));
	}
}

