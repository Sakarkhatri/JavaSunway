package com.fourthassighnment;

public class Thisthis {
		  
	    private String name;
	    private int age;
	    public Thisthis(String name){
	    	//
	    	this(20);// This line of code calls the second constructor.
	        this.name = name;
	    }
	    //second constructor
	    public Thisthis(int age){
	        System.out.println("Age = " + age);
	        }
	    public void show(){
	        System.out.println("Name = " + this.name);
	    }
	  
	    public static void main(String[] args){
	    	Thisthis tt = new Thisthis("Geeks");
	        tt.show();
	    }
	}

