package com.assighnment;
import java.util.Scanner;
public class bill {

	public static double TotaUnit(double unit) {
		if (unit<=100) {
		return 0;
		}
		else if(unit>100 && unit<=200) {
			return 5*(unit-100);
		}
		else {
			return 10*(unit-200)+500;
		}
		
	}
	
	public static void main(String[]args) {
		Scanner B =new Scanner(System.in);
		System.out.print("Enter the total unit consumed. ");
		int unit = B.nextInt();
		System.out.print("Total bill : "+bill.TotaUnit(unit));
		
	}
}
