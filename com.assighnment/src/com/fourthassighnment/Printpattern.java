package com.fourthassighnment;

public class Printpattern {
//public static void main(String[] args) {
//	for(int i=0;i<=3;i++) {
//		for(int j=0;j<=9;j++) {
//			System.out.print("* ");
//		}
//		System.out.println(" ");}
//	System.out.println("\n");
//	
//	
//	for(int i=0;i<=4;i++) {
//		for(int j=0;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println(" ");
//		}
//	System.out.println(" \n");
//
//	for(int i=0;i<5;i++) {
//		for(int j=0;j<5;j++) {
//			if(j<(4-i)) {
//				System.out.print(" ");
//			}
//			else {
//				System.out.print("*");
//			}
//		}
//		System.out.println(" ");
//		}
//	System.out.println(" \n");
//	
//	for (int i = 1; i <= 5; i++){
//		
//		for (int j = 4; j >= i; j--){
//			System.out.print(" ");
//		}
//		for (int k = 1; k <= i; k++){
//			System.out.print(i);
//		}
//		for (int l= 2; l <= i; l++){
//			System.out.print(i);
//		}
//		System.out.println();
//	}
//	System.out.println(" ");
//
//		
//	for (int i = 1; i <= 5; i++)
//    {
//        for (int j = 4; j>=i; j--){
//            System.out.print(" ");
//        }
//        // Print star in increasing order
//        for (int k = 1; k <= i ; k++){
//            System.out.print("*");
//        }
//        for(int l=2; l<=i; l++) {
//        System.out.print("*");
//        }
//        System.out.println("");
//
//    }
//for (int i = 1; i <= 5; i++){
//		
//		for (int j = 4; j >= i; j--){
//			System.out.print(" ");
//		}
//		for (int k = 1; k <= i; k++){
//			System.out.print(1);
//		}
//		for (int l= 2; l <= i; l++){
//			System.out.print(i);
//		}
//		System.out.println();
//	}
//	System.out.println(" ");
//}

	 public static void main(String[] args) {
	        System.out.println("Pattern 4:");
	        int n = 5;
	        for(int i=0;i<n;i++) {
	            for(int j=0;j<(2*n-1);j++) {
	                if(j<((n-i-1))) System.out.print(" ");
	                else if(j >= n-i-1 && j <= n-1) System.out.print(n-j);
	                else if(j <= n+i-1 && j > n-1) System.out.print(j-n+2);
	                else if(j >= n+i-1) System.out.print("");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

}


