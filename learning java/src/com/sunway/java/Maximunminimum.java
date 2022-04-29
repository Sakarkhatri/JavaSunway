package com.sunway.java;

import java.util.Scanner;

public class Maximunminimum {
	
    //this is also method

	public double  maximumnumber(int N1, int N2, int N3) {
		if(N1>N2 && N1>N3 ) {
            return N1;
        }
        else if(N2>N3 && N2>N1 ) {
            return N2;
        }

        else {
            return N3;
        }
		
	}
	public double  minimumnumber(int N1, int N2, int N3) {
		if(N1<N2 && N1< N3) {
			return N1;    
			}
        else if(N2<N3 && N2<N1) {
        	return N2;        
        	}

        else {
        	return N3;        
        	}
	}
	

    public static void main(String[] args) {
    
        Scanner user = new Scanner(System.in);
        
        System.out.println("Enter the first no :");
        int N1 = user.nextInt();
        
        System.out.println("Enter the second no :");
       int  N2 = user.nextInt();
       
        System.out.println("Enter the third no :");
       int  N3 = user.nextInt();
       
       //this is an object
       Maximunminimum A=new Maximunminimum();
       Maximunminimum B=new Maximunminimum();
      

        //calling object
       System.out.println("The max number is :" + A.maximumnumber( N1,  N2,  N3));
       System.out.println("The min number is :" + B.minimumnumber( N1,  N2,  N3));
    }
}
