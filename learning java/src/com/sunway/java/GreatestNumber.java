package com.sunway.java;

import java.util.Scanner;

public class GreatestNumber {
		public static void main(String[]args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter one number : ");
			int x = scan.nextInt();
			
			System.out.println("Enter another number : ");
			double y = scan.nextDouble();
			
			if(x>y) {
				System.out.println(x + " is greater number ");
		}
			else {
				System.out.println(y + " is greater number ");
			}
		}
}
