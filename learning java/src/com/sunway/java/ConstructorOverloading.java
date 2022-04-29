package com.sunway.java;

//this is methodoverloading


public class ConstructorOverloading {
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	public void sum(int a, int b, int y) {
		System.out.println(a+b+y);
	}
	public void sum(int a, int b, String name) {
		System.out.println(a+b+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading();
		co.sum(10,9);
		ConstructorOverloading co1 = new ConstructorOverloading();
		co1.sum(10,-22,9);
		ConstructorOverloading co2 = new ConstructorOverloading();
		co1.sum(10,-22,"ram");
		
		
	}

}
