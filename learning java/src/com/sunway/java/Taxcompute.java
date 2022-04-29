package com.sunway.java;

//import java.util.Scanner;

public class Taxcompute {

	double x;//input for variable or income
	double y;//for tax amount
	
	public  double income(double x) {
//this is for user input.
//		Scanner t = new Scanner(System.in);
//       System.out.println("Enter your income :");
//       x = t.nextInt();
        
        if (x<=100000) {
        
        return 0;
        }
        else if (x>100000 && x<=150000) {
        	return (.1*(x -100000));
            //System.out.println("Tax amount is :" + y);
        }
        else if (x>=150000 && x<=250000) {
        	return (5000 + .2*(x -150000));
            //System.out.println("Tax amount is :" + y);
        }
        else if (x>=250000) {
            return (25000 + .3*(x -150000));
            //System.out.println("Tax amount is :" + y);
        }
        else {
        	return x;
        }
	}
    	public static void main(String[] args) {

    		Taxcompute Tc =new Taxcompute();
    		System.out.println("the tax for the income 90000 "  + "is : " + Tc.income(90000));
    		System.out.println("the tax for the income 300000 "  + "is : " + Tc.income(300000));
    		System.out.println("the tax for the income 800000 "  + "is : " + Tc.income(800000));
    		System.out.println("the tax for the income 2000000 "  + "is : " + Tc.income(2000000));
	}
}
