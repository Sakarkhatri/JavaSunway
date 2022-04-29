package com.sunway.java;

public class Employe2 {

//this is method to increase salary of the employee
		public void IncreasedSalary(String name,String category) {
			System.out.println("Increased salary of CEO is : " + (0.4*500000+500000));

	}
		public void IncreasedSalary(String category,double salary) {
			System.out.println("Increased salary of Branch Manager is : " + (0.3*400000 + 400000));
		}
		
		public void IncreasedSalary(double salary,String name) {
			System.out.println("Increased salary of Section Manager is : " + (0.2*300000 + 300000));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employe2 co = new Employe2();
			co.IncreasedSalary("Achyut", "CEO");
			Employe2 co1 = new Employe2();
			co1.IncreasedSalary("Branch Manager", 300000);
			Employe2 co2 = new Employe2();
			co2.IncreasedSalary(400000, "sakar");
			
			
		}
}
