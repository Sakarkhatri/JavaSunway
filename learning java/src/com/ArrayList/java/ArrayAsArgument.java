package com.ArrayList.java;

public class ArrayAsArgument {
	
	public static void calculate(int[]arr) {
		for(int i:arr) {
			System.out.print(i+",");
		}System.out.println();

	}
	public static void minmax(int[]arr) {
		int max=0;
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
	
		int min=0;
		for(int i=0; i<arr.length; i++ ) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
	
		System.out.println("Maximum value in the array is::"+ max);
		System.out.println("Minimum value in the array is::"+ min);
	}
	public static void sum(int[]arr) {
		int sum = 0;
		for (int i : arr)
		    sum += i;//or sum= sum+i;
		System.out.println("The sum is :" + sum);
	}
	public static void main(String[] args) {
		int array[] = new int[]{12,21,33,989,767,56,4,-1,49,23};
			calculate(array);
			minmax(array);
			sum(array);
		}
	}
