package com.ArrayList.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArraaList {

	public static void sortelements(ArrayList<Integer>myarraylist) {
	System.out.println("Initial assay list: "+myarraylist);
	Collections.sort(myarraylist);
	System.out.println("Sorted assay list: "+myarraylist);

	}
	public static void main(String[] args) {
		ArrayList<Integer> mylist =new ArrayList<>();
		mylist.add(5);
		mylist.add(45);
		mylist.add(35);
		mylist.add(55);
		mylist.add(25);
		mylist.add(15);

		sortelements(mylist);
	}
}
