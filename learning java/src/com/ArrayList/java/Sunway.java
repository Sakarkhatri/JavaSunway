package com.ArrayList.java;

public class Sunway {
public void takeClass(ClassesSunway cs) {
	//cs.run();
	System.out.println(	cs.getNoOfDesk());
	System.out.println(	cs.getNumberOfStudents());
	System.out.println(	cs.getType());
	}
public static void main(String[] args) {
	ClassesSunway cs304 =new ClassesSunway("lecture",30,50);
	Sunway sw = new Sunway();
	sw.takeClass(cs304);
	}
}
