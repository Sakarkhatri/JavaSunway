package com.fourthassighnment;

import java.util.Scanner;

public class Students {
	    String name;
	    Students() {
	        this.name = "Unknown";
	    }
	    Students(String name) {
	        this.name = name;
	    }
	    public void display() {
	        System.out.println("Name of the student: "+this.name);
	    }
	    public static void main(String[] args) {
	        Students first = new Students();
	        first.display();
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the name of a student:");
	        String name = scan.nextLine();
	        Students second = new Students(name);
	        second.display();
	    }
	}

