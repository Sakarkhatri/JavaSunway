package com.assighnment5;
public class IndexNumber {

	public static void main(String[] args) {

		  int num[] = new int[]{12,21,33,989,767,56,4,-1,49,23};
		  int smallest = num[0];
		  int largest = num[0];

		  for (int i = 1; i < num.length; i++) {
		   if (num[i] > largest)
		    largest = num[i];
		   
		   else if (num[i] < smallest)
		    smallest = num[i];
		  }
		  System.out.println("Largest Number is : " + largest);
		  
		  System.out.println("Smallest Number is : " + smallest);
		 }
	
}
