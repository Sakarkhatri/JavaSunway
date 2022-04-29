package com.sunway.java;

import java.util.Scanner;

public class totalMarks {
double fullmarks = 300;

public static double totalmarks(double math, double english, double science) {
	return math+english+science ;
}
public static void main (String[]args) {
	Scanner SS = new Scanner (System.in);
	System.out.println("Enter the no marks in math");
	double math = SS.nextDouble();
	
	System.out.println("Enter the no marks in english");
	double english = SS.nextDouble();

	System.out.println("Enter the no marks in Science ");
	double science = SS.nextDouble();
	
	totalMarks tM= new totalMarks();
	
	System.out.println("total marks obtained is : "+ (tM.totalmarks( math,  english,  science))+" out of 300");

	System.out.println("total percentage obtained is : "+ (tM.totalmarks( math,  english,  science)/ tM.fullmarks)*100+"%");

}
	
}
