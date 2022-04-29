package com.assighnment;
import java.util.Scanner;
public class librarycharge {
public static double Totaldays(double days) {
	if(days<=5) {
		return 2*days;
	}
	else if (days>=6 && days <=10) {
		return 3*days;
	}
	else if (days>=11 && days <=15) {
		return 4*days;
	}
	else {
		return 5*days;
	}
}
public static void main(String[]args) {
	Scanner B =new Scanner(System.in);
	System.out.print("Enter the total days. ");
	int days = B.nextInt();
	System.out.print("Total library charge is : " + librarycharge.Totaldays(days));
	
}
}
