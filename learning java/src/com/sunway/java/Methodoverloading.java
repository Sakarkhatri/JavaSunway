package com.sunway.java;
// method overloading

public class Methodoverloading {
	
	public void calculate(int x) {
		System.out.println(x+x);
		
	}
	public void calculate(int x, int y) { //parameters
		System.out.println(x*y);
		}
	public void calculate(int x, String y) { //data type
			System.out.println(x+y);
	}
	public void calculate(String y, int x) { //sequence
		System.out.println(y+x);
	}
	
	public static void main(String[] args) {
		Methodoverloading mo =new Methodoverloading(); //mo is object 
		mo.calculate(5);
		mo.calculate(5, 10);
		mo.calculate(10, "Sagar");
		mo.calculate("Roshan", 5);
		
	}
}
