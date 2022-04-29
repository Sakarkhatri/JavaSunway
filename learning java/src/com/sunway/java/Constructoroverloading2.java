package com.sunway.java;

public class Constructoroverloading2 {

	int id;
	double number;
	String name;
	
	
	Constructoroverloading2(int id) {
		this.id = id;
		System.out.println("Inside 1st Constructor");
	
		
	}
	Constructoroverloading2(int id, String name) {
		this.id = id;
		this.name= name;
		System.out.println("Inside 2nd Constructor");
	}
	
	Constructoroverloading2(double number, String name) {
		this.number=number;
		this.name = name;
		System.out.println("Inside 3rd Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading2 c1 = new Constructoroverloading2(21, "roshan");
		//Constructoroverloading2 c2 = new Constructoroverloading2(2);
		Constructoroverloading2 c3 = new Constructoroverloading2(21.02, "roshan");
		

			
	}

	}

