package com.sunway.java;
import java.util.Scanner;
public class Exam {

	public double classAttendance(double held, double attended) {
		return (attended/held)*100;
	}
	public boolean examTake(double attendance) {
		if(attendance>=75) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of classes held");
		double classHeld=scan.nextDouble();
		
		System.out.println("Enter number of classes attended");
		double classAttend=scan.nextDouble();

		//object
		Exam student=new Exam();
		
		double attendance= student.classAttendance(classHeld, classAttend);
		System.out.println(attendance+ "% is your class attendance");
		
		if(student.examTake(attendance)) {
			System.out.println("You are allowed to take exam");
		}else {
			System.out.println("You are not allowed to take exam");
		}
		scan.close();
	}
}