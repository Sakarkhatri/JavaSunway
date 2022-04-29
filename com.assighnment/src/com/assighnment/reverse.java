package com.assighnment;
import java.util.Scanner;

public class reverse {	
	
	//public static void main(String[] args) {

//  int num = 58964;
//  int reversed = 0;
//	    
//	    System.out.println("Original Number: " + num);
//
//	    // run loop until number becomes 0
//	    while(num!= 0) {
//	    
//	      // get last digit from number
//	      int digit = num % 10;
//	      reversed = reversed * 10 + digit;
//
//	      // remove the last digit from number
//	      num /= 10;
//	    }
//
//	    System.out.println("Reversed Number: " + reversed);
//	  }
	
	//this is for user input method
	
	public static void main(String[] args) {
	 int reversed = 0;
		Scanner R = new Scanner(System.in);
		System.out.println("enter the number");
		int num =R.nextInt();

	 while(num!= 0) {
		      // get last digit from number
	          int digit = num % 10;
		      reversed = reversed * 10 + digit;
	
		      num /= 10;
		      
		    }
	    System.out.println("Reversed Number: " + reversed);
	}
}


