package com.TwoDArray.java;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the number of rows");
//	int row = s.nextInt();
//	 
//	System.out.println("Enter the number columns");
//	int col = s.nextInt();
//	 
//	int arr [][] = new int[row][col];
	int arr [][] = new int[3][3];

	
	for ( int i= 0 ; i < 3 ; i++ ){ 
		for ( int j= 0 ; j < 3 ;j++ ) {
			System.out.println("Enter the elements ");
			arr[i][j] = s.nextInt();
			
		System.out.println();
		}
	}

		System.out.println();
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
				sum += arr[i][j];
			}
			System.out.println();
		}
	System.out.print("The sum is :");
	System.out.println(sum);

}
}

