package com.assighnment6.java;

import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeArrayList {
	String name;
	double salary;
	int date;
	public EmployeeArrayList(String name, double salary, int date) {
		super();
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	public static void main(String[] args) {
			ArrayList<EmployeeArrayList> emplist =new ArrayList<EmployeeArrayList>();
			Scanner S=new Scanner(System.in);
			for(int i=0; i<1; i++) {
				System.out.println("Enter the name :");
				String ename =S.next();
				System.out.println("Enter the salary :");
				double esalary =S.nextDouble();
				System.out.println("Enter the date :");
				int edate =S.nextInt();
				
				EmployeeArrayList S1 =new EmployeeArrayList(ename, esalary, edate);
				emplist.add(S1);
			
			}
			for(int i=0;i<1;i++) {
			System.out.println(emplist.get(i).name);
			System.out.println(emplist.get(i).salary);
			System.out.println(emplist.get(i).date);


//			int i=0;
//			for(EmployeeArrayList emp : emplist) {
//				System.out.println("Employee "+(++i));
//				System.out.println(emp.name);
//				System.out.println(emp.salary);
//				System.out.println(emp.date);
//				System.out.println();
			}
	}
}
	
