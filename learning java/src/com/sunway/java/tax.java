package com.sunway.java;
public class tax {

	double x;//input for variable or income
	double y;//for tax amount
	
	public  double income(double x) {
        if (x<=100000) {
        return 0;
        }
        else if (x>100000 && x<=150000) {
        	return (.1*(x -100000));
        }
        else if (x>=150000 && x<=250000) {
        	return (5000 + (.2*(x -150000)));
        }
        else if (x>=250000) {
            return (25000 + (.3*(x -250000)));
        }
        else {
        	return x;
        }
	}
    	public static void main(String[] args) {

    		tax Tc =new tax();
    		
    		System.out.println("the tax for the income 99000  "  + "is : " + Tc.income(99000));
    		System.out.println("the tax for the income 300000 "  + "is : " + Tc.income(300000));
    		System.out.println("the tax for the income 800000 "  + "is : " + Tc.income(800000));
    		System.out.println("the tax for the income 2000000"  + "is : " + Tc.income(2000000));
	}
}
