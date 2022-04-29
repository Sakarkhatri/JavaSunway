package com.sunway.java;
import java.util.Scanner;
public class Studentresult {

	double x,y,z;
	
	public double total(double x,double y,double z) {
		return x+y+z;
	}
	public double percent(double Total) {
		return (Total/300)*100;
	}
	
	public static boolean errorCheck(double arr[]) {
		//this is to check each value of array if it's greater than 100
		//if greater than hundred than it is error
		// so we return true
		// after checking all the values if no error we return true
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>100) {
//				System.out.println("ERROR");
				
//				break;
				return true;
				
				}
		}return false;
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
		

		boolean error=errorCheck(arr);
		//System.out.println(error);
		if(error) {
			System.out.println("error occured");
		}else {
			//object
			Studentresult S=new Studentresult();
			double marks = S.total(x,y,z);
			
			System.out.println("Your scored "+ marks +"in total.");

			//calling marks from the object and method (percent)
			System.out.println("You scored "+ S.percent(marks) + "%.");
			//if (marks>300) {
			//System.out.println("ERROR");
		}
		
		
		}

		

	}

