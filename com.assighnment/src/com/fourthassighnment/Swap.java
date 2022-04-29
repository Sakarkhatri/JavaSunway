package com.fourthassighnment;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		int x;
		int y;
		Scanner B =new Scanner(System.in);
		System.out.print("Enter the number");
		x = B.nextInt();
		System.out.print("Enter the another number");
		y = B.nextInt();
		
	System.out.println("x is "+x);
	System.out.println("y is "+y);

	System.out.println("");
	System.out.println("After Swap:");

	int temp=x;
	x=y;
	y=temp;
	System.out.println("x is "+x);
	System.out.println("y is "+y);
	}
	
}
