package com.assighnment;

import java.util.Scanner;

public class Palindromenumber {
	public static void main(String[] args) {
		int reverse =0;
		int reminder = 0;
		
		Scanner R = new Scanner(System.in);
		System.out.println("enter the number");
		int num =R.nextInt();
		
		int T=num;//t stands for temporary number
		
		while (num!= 0) {
			 reminder = num%10;//to get the reminder.
			 reverse = (reverse*10)+reminder;
			 num =num/10;
		}
		if(T==reverse) {
			System.out.println(T + " is an Palindrome number");
		}
		else {
			System.out.println(T + " is not an Palindrome number");
		}
	}
}