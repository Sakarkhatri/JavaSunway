package com.assighnment5;
import java.util.Scanner;
public class TakeTenInt {
		public static void main(String[] args) {
			Scanner S = new Scanner(System.in);
			int[] arr = new int[10]; // install the array
			boolean present = false; // putting flag condition
			for (int i = 0; i < arr.length; i++) { // taking values
				System.out.println("enter number");
				arr[i] = S.nextInt();
			}
			System.out.println("enter number to check ");
			int number = S.nextInt(); // taking values of checking
			for (int i : arr) {// for all element in array/array tail.
				if (i == number)
					present = true;

			}
			System.out.println(present); // Output the value is True or False

		}

	}


