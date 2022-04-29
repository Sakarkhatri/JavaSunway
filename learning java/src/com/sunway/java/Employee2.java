package com.sunway.java;
import java.util.Scanner;
public class Employee2 {
	int id;
double salary;
String category,name;


		Employee2(){
			this.salary = 20000;
			this.category = "Manager";
			this.name ="No name";
		}
		Employee2(String name){
			this.salary = 10000;
			this.category = category;
			this.name = name;
		}
		Employee2(String name,String category,double salary){
			this.salary = salary;
			this.category = category;
			this.name =name;
		}
		Employee2(String category,String name,double salary,int id){
			this.id= id;
			this.salary = salary;
			this.category = category;
			this.name =name;
			
		}
		//this is method to increase salary of the employee
		
		public double IncreasedSalary() {
			System.out.println("Method 2");
			return this.salary*this.percentincreament();
		}
		public double percentincreament() {
			if (this.category =="CEO") {
			return 0.4;	
			}
			else if (this.category =="Branch Manager") {
			return 0.3;
			}
			else if (this.category =="Manager") {
			return 0.2;
			}
			else {
			return 0;
			}
		}
			
		
		
		
		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is object.
				Employee2 Achyut =new Employee2("Achyut", "CEO", 500000);
				Employee2 Roshan =new Employee2("Roshan", "Branch Manager", 300000);
				Employee2 Sakar =new Employee2("Sakar","Manager",200000);


				System.out.println("this is the salary of " + Achyut.name + ": " + Achyut.salary);
				System.out.println("this is the salary of " + Sakar.name + ": " + Sakar.salary);
				System.out.println("this is the salary of " + Roshan.name + ": " + Roshan.salary);
				
				System.out.println("\n");
				
				
				System.out.println("The increased salary of " + Roshan.name + "is : " + (Roshan.salary+Roshan.IncreasedSalary()));
				System.out.println("The increased salary of " + Sakar.name + "is : " + (Sakar.salary+Sakar.IncreasedSalary()));
				System.out.println("The increased salary of " + Achyut.name + "is : " + (Achyut.salary+Achyut.IncreasedSalary()));

	}

}
