package com.ArrayList.java;

import java.util.ArrayList;

public class Employees {
	public static void main(String[] args) {
			Employee e1 = new Employee(1, "Roshan", 50000);
			Employee e2 = new Employee(2, "Bibsh", 60000);
			Employee e3 = new Employee(3, "Pratik", 40000);
			Employee e4 = new Employee(4, "Ashish", 70000);
			Employee e5 = new Employee(5, "Bibek", 45000);


			ArrayList<Employee> emplist =new ArrayList<Employee>();
			emplist.add(e1);
			emplist.add(e2);
			emplist.add(e3);
			emplist.add(e4);
			emplist.add(e5);

			for(Employee i:emplist) {
				System.out.println(i.getId());
				System.out.println(i.getName());
				System.out.println(i.getSalary());
				i.Tax();
		}
	}

}
