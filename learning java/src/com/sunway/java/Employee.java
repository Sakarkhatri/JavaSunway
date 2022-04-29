package com.sunway.java;

import java.util.Scanner;

// Create an `Employee` class which contains a method to increase the salary of employees by 20% when 
//called. Define the class in such a way that objects can have distinct employee level(designation). 
//Use constructor overloading for default category and user-defined category. (At least 3 categories) 
public class Employee {
	
	// this is attributes
	String category,name;
	double salary;
	
	
	//constructor overloading
	Employee(){
		this.salary = 20000;
		this.category = "Manager";
		this.name ="No name";
	}
	Employee(String name){
		this.salary = 10000;
		this.category = "category";
		this.name = name;
	}
	Employee(String name,String category,double salary){
		this.salary = salary;
		this.category = category;
		this.name =name;
	}
	//this is method to increase salary
	public double IncreasedSalary() {
		System.out.println("Method 1");

		//this.salary is the salary of object that called method
		return 0.2*this.salary;
		
	}
	//this is for method overloading
	public double IncreasedSalary(double salary) {
		System.out.println("Method 2");
		return 0.2*this.salary;
	}
	
	public static void main(String[]args) {
		//this is object.
		Employee Roshan =new Employee("roshan", "Manager", 50000);
		Employee Sakar =new Employee("sakar", "Branch Manager", 90000);
		Employee Achyut =new Employee("Achyut");


		System.out.println("this is the salary of " + Achyut.name + ": " + Achyut.salary);
		System.out.println("this is the salary of " + Sakar.name + ": " + Sakar.salary);
		System.out.println("this is the name of " + Achyut.name + ": " + Achyut.salary);

		System.out.println("this is the salary of " + Roshan.name + ": " + Roshan.salary);
		
		System.out.println("\n");
		
		System.out.println("this is the increased salary of " + Roshan.name + "is : " + (Roshan.salary+Roshan.IncreasedSalary()));

		System.out.println("\n");
		
		System.out.println(Sakar.salary + Sakar.IncreasedSalary(Sakar.salary));// this is for method overloading
		
		}  	
	
		
	}

 	