package com.sunway.java;

public class Constructoroverload2 {
	
		//instance variables of the class  
		int id;  
		String name;
		String contactNo;
		String collegeName;  
		  
		Constructoroverload2(String Name, String contactNo){  
		this.contactNo = contactNo;  
		this.name = Name;  
		}  
		  
		Constructoroverload2(int id, String name){   
		this.id = id;  
		this.name = name;  
		}  
		  
		public static void main(String[] args) {  
		//object creation  
			Constructoroverload2 s = new Constructoroverload2("John", "9803130365");  
		System.out.println("Printing Student Information:\n");  
		System.out.println("Name:" +s.name+ "\nId:" +s.id+  "\nContact No:" +s.contactNo);  
		}  
		
		
	}

	

	
