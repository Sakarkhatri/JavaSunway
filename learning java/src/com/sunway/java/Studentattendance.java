package com.sunway.java;
import java.util.Scanner;

public class Studentattendance {

	public double Classattendance(double held, double attended) {
		return (attended/held)*100;
	}
	//public boolean examtaken(double attendance) {
		//if(attendance>=75) {
			//return true;
		//}
		//else {
			//return false;
		//}
	//}
		
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter number of classes held");
			double classheld=scan.nextDouble();
			
			System.out.println("Enter number of classes attended");
			double classattend=scan.nextDouble();
			
			//this part is an object
			Studentattendance S=new Studentattendance();
			double attendance= S.Classattendance(classheld, classattend);
			
			System.out.println(attendance + "% is your class attendance");
			
			if(attendance>75) {
				System.out.println("You are  allowed to  sit in exam");
			}
			else {
				System.out.println("You are not allowed to sit in exam");
			}

			scan.close();

		
	}
}

