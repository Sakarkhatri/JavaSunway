package com.fourthassighnment;

public class ConstructorChain {
		ConstructorChain(){  
		this("Sakar");  
		System.out.println("Default constructor called.");  
		}  
		ConstructorChain(String name){  
		System.out.println("Parameterized constructor called");  
		}  
		public static void main(String args[])   
		{   
		//initializes the instance of example class  
		ConstructorChain cc = new ConstructorChain();   
		}   
		
}
