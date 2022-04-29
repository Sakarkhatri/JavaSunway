package com.sunway.java;

import java.util.Scanner;

public class ScannerUsername {
	public static void main (String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int x = scan.nextInt();
		
		System.out.println("Enter Your Name : ");
		String name = scan.next();
		
		System.out.println("The number you typed is " + x + " and your name is "+ name);
		scan.close();
		
	}

}
