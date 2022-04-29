package com.sunway.java;

import java.util.Scanner;

public class Grading {
	public static void main(String[]args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter another number : ");
		double x = scan.nextDouble();
	
		
		if(x>=80) {
			System.out.println("Your Grade is : A ");
	}
		else if(x<80&&x>=60){ 
			System.out.println("Your Grade is : B ");
		}
		else if(x>=50){
			System.out.println("Your Grade is : C ");
		}
		else if(x>=45){
			System.out.println("Your Grade is : D ");
		}
		else if(x>=25){
			System.out.println("Your Grade is : E ");
		}
		else if(x<=25){
			System.out.println("Your Grade is : F ");
		}
		else {
			System.out.println("Your Grade is : F ");
		}

		
	}
}
