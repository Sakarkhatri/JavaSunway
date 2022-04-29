package com.sunway.java;

import java.util.Scanner;

public class Sumoftheproduct {
	public double  Sumoftwonumbers(int x, int y) {
		return(x+y);
		
	}
	public double  Productoftwonumbers(int x, int y) {
		return(x*y);
		
	}
	
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the first no :");
        int x = user.nextInt();
        
        System.out.println("Enter the second no :");
       int  y = user.nextInt();
      
       //this is an object
       Sumoftheproduct A=new Sumoftheproduct();
       Sumoftheproduct B=new Sumoftheproduct();
       
       System.out.println("The sum of two number is :" + A.Sumoftwonumbers( x,y));
       System.out.println("The product of number is :" + B.Productoftwonumbers( x,y));
    }
}