package com.assighnment;

import java.util.Scanner;

public class Integerr {
	
	public static void main(String[]args) {
		int x=0;
		int sumOfOdd=0;
		int sumOfEven=0;
		
		do {
		Scanner set = new Scanner(System.in);
		System.out.println("Please enter the set of integers :");
		x= set.nextInt();
		if(x%2==0) {
			sumOfEven=(sumOfEven+x);
		}
		else {
			sumOfOdd=(sumOfOdd+x);
		}
		}while(x!=0);
	      System.out.println("\n");

		System.out.println("The sum of even integer is :"+sumOfEven);
		System.out.println("The sum of odd integer is :"+sumOfOdd);

	}

}
