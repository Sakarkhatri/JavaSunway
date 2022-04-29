package com.assighnment;

import java.util.Scanner;
public class Studentresult {

	double x,y,z;
	
	public double total(double x,double y,double z) {
		return x+y+z;
	}
	public double percent(double Total) {
		return (Total/300)*100;
	}
	
	
	public static void main(String[]args) {
		Scanner Result = new Scanner(System.in);
		
		System.out.println("Marks obtained first subject in");
		double x = Result.nextDouble();
		
		System.out.println("Marks obtained second subject in");
		double y = Result.nextDouble();
		
		System.out.println("Marks obtained third subject in");
		double z = Result.nextDouble();
		
		double[] arr= {x,y,z};
		

	
			//object
			Studentresult S=new Studentresult();
			double marks = S.total(x,y,z);
			
			System.out.println("Your scored "+ marks +"in total.");

			//calling marks from the object and method (percent)
			System.out.println("You scored "+ S.percent(marks) + "%.");
			
		}
		
		
		}

		

	

