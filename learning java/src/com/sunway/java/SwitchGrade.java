package com.sunway.java;

import java.util.Scanner;

public class SwitchGrade {
	public char calculateGrade() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int x = s.nextInt();
		s.close();

		if(x>=80) {
			return 'A';
	}
		else if(x<80&&x>=60){ 
			return 'B';
		}
		else if(x>=50){
			return 'C';
		}
		else if(x>=45){
			return 'D';
		}
		else if(x>=25){
			return 'E';
		}
		else if(x<=25){
			return 'F';
		}
		else {
			return 'F';
		}
		
	}
	

	public static void main(String[]args) {
		SwitchGrade SG =new SwitchGrade();
		char mark = SG.calculateGrade();
	
		System.out.println("Your obtained Grade is  " + mark);

		switch (mark) {
		
		case 'A':
		System.out.println("Your result is outstanding");
		break;
		
		case 'B':
		System.out.println("Your result is Excellent");
		break;

		case 'C':
		System.out.println("Your result is Good");
		break;
		
		case 'D':
		System.out.println("Your result is Average");
		break;
		
		case 'E':
		System.out.println("Your result is Poor ");
		break;
		
		case 'F':
		System.out.println("Your result is Fail ");
		break;
		}
}
}
