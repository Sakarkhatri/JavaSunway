package com.sunway.java;

public class Methodoverload {
	
	public void area(int l, int b) { 
		int areaofrec = l*b;
		System.out.println("The area of rectangle is " + areaofrec);
		}
	
	
	public void area(int s) {
		int areaofsquare = s*s;
		System.out.println("The area of square is " + areaofsquare);
		
	}
	
	public void area(double r) { 
		double areaofcircle = 3.14*r*r;
			System.out.println("The area of the circle is " + areaofcircle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverload MO = new Methodoverload();
		MO.area(5,5);
		MO.area(5);
		MO.area(2.1);
		
		

	}

}
