package com.sunway.java;
import java.util.Scanner;
public class Bonus {

	public static void main(String[]args) {
     	double salary;
		double year;
		double bonus;
		
		Scanner increase = new Scanner(System.in);
		System.out.print("Please enter your salary :");
		salary = increase.nextDouble();

		System.out.print("Please enter your  year of service :");
		year = increase.nextDouble();
		if (year>=5) {
			bonus=(.05*salary);
			
			System.out.print("You receive a bonus of :"+ bonus);
			System.out.print("\n");
			System.out.print("You total salary is :"+ (bonus + salary));
		}
		else {
			System.out.print("You total salary is :"+  salary);
		}
		
	}
}
	

