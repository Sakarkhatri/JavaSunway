package com.sunway.java;

import java.util.Scanner;

public class Printint {
	int x;
	String c;
	
	public void  Firstsequence(int x, String c) {
	       System.out.println("The first sequence is :" + x+c);
	}
	
	public void  Secondsequence(String c, int x) {
	       System.out.println("The second sequence is :" + c+x);		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer :");
        int  x = scan.nextInt();
        
        System.out.println("Enter the second character :");
        String c = scan.next();
        
        Printint A=new Printint();
        Printint B=new Printint();
        
        A.Firstsequence( x,c);
        B.Secondsequence( c,x);
        
        }
	}



