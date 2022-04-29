package com.sunway.java;

import java.util.Scanner;

public class Scannerifelse {
	public static void main(String[]args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int x = scan.nextInt();
		if(x%2 == 0) {
			System.out.println(x + " is an even number ");
	}
		else {
			System.out.println(x + " is an odd number");

		}
	}

}
