package com.sunway.java;
import java.util.Scanner;
public class firstFivenumbers {
	public static int firstno (int number) {
		return number/10000;
	}
	public static int fourthno (int number) {
		return (number%100)/10;
	}
	public static void main(String[]args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the five digit number");
		int number=scan.nextInt();
		System.out.println("First digit is: "+firstFivenumbers.firstno(number));
		System.out.println("Fourth digit is: "+firstFivenumbers.fourthno(number));
		System.out.println("\n");
		System.out.println("The sum of first and fourth digit of an five digit number is: "+(firstFivenumbers.fourthno(number)+firstFivenumbers.firstno(number)));

	}
}
