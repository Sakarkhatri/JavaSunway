package com.sunway.java;

public class Rectangle {
	int length;
	int breadth;
	//constructor with no parameter
	Rectangle(){
		this.length= 0;
		this.breadth= 0;
	}
		

	//constructor with length and breadth parameter

	Rectangle(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	//constructor with one  parameter

	Rectangle(int length){
		this.length = this.breadth = length;
	}
	
	//method to calculate area 
	public void calcuArea() {
		System.out.println("Area is :"+  this.length * this.breadth);
		
	}
	
	public static void main(String[] args) {
Rectangle R1 = new Rectangle();
R1.calcuArea();

Rectangle R2 = new Rectangle(5);
R2.calcuArea();

Rectangle R3 = new Rectangle(6,5);
R3.calcuArea();

	}

	
	}


