package com.TwoDArray.java;

public class TwoDArray {
public static void main(String[] args) {
	int[]arr = {1,2,3,4,3,2,1};
	System.out.println(arr[2]);
	
	//two d array
	int[][] myarr;  //initializating
	myarr = new int[2][2];
	//passing valuess
	myarr [0][0]=5; 
	myarr [0][1]=1;
	myarr [1][0]=2; 
	myarr [1][1]=4; 
	for(int i=0;i<2;i++) {
		for(int j =0; j<2 ;j++) {
			System.out.print(myarr[i][j] + " ");
		}
		System.out.println();
	}
	myarr[0][1] = 34; //changing value of [0][1]
	
	System.out.println("using enhanced for loop");
	for(int[]each:myarr) {
		for(int i:each) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	String [][]myname= {{"Sakar", "Bibsh"},{"roshan","pratik"},{"Bibek","Uday"}};
	for(String[]each:myname) {
		for(String i:each) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
}
}
