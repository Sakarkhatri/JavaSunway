package com.assighnment;

import java.util.Scanner;

public class Tilluserwants {
	public static void main(String[]args) {
		int num=0;
		int largest=0;
		int smallest=0;
		char choice;
		
		Scanner set = new Scanner(System.in);
		System.out.println("Please enter the set of integers :");
		num= set.nextInt();
		
		do {
//		Scanner set = new Scanner(System.in);
		
		if(num>largest) {
			largest=num;
		}
		if(num<smallest) {
			smallest=num;
		}
	      System.out.println("Y or N");

		choice=set.next().charAt(0);
		}while(choice=='Y'|| choice=='y');
	      System.out.println("\n");

		System.out.println("Largest integer is :"+largest);
		System.out.println("Smallest integer is :"+smallest);
	}
}
