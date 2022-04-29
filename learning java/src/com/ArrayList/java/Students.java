package com.ArrayList.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
	ArrayList<Student> studlist =new ArrayList<Student>();
	Scanner S=new Scanner(System.in);
	for(int i=0; i<5; i++) {
		System.out.println("Enter the name :");
		String uname =S.next();
		System.out.println("Enter the address :");
		String uaddress =S.next();
		System.out.println("Enter the email :");
		String uemail =S.next();
		
		Student S1 =new Student(uname, uaddress, uemail);
		studlist.add(S1);
	}
	}
}
