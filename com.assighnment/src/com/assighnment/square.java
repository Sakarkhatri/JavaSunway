package com.assighnment;

import java.util.Scanner;

public class square {
public static int isSquare(int n) {
	int rvalue =0;

	for(int i=0;i*i<=n;i++) {
		if(i*i==n) {
			return 1;
		}
	}
	return rvalue;
}
public static void main(String[] args) {
	Scanner R = new Scanner(System.in);
	System.out.println("enter the number");
	int n =R.nextInt();
	System.out.println(square.isSquare(n));
}
}