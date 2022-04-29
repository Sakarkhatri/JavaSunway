package com.sunway.java;
import java.util.Scanner;

public class Discount {
	int amount;
	char type;
	String L,D;
	double discountPercent;
	
	public static double netDiscount(int amount, char type) {// made this static to the class
		if(amount>100000) {
			if(type=='L'){
				return 10;
				}
				else {
					return 15;
					}
		}
		
		
		else if(amount>57000) {
			if(type=='L') {
			return 7.5;
			}
			else {
				return 10;
				}
			}		
		
		else if(amount>25000){
			if(type=='L'){
				return 5;
				}
				else {
					return 7.5;
					}
				}
		
		else {
			return 0;
					}
		}
	
	public double NetAmount(int amount,char type) {
	
		double discountpercent =netDiscount(amount,type);
		this.discountPercent=discountpercent;// attribute discountPercent made to use in object
		double discountamount=(discountpercent/100)* amount;
		
		System.out.println("discount percent : "+discountpercent+"%");

		double netAmount= amount-discountamount;

		return netAmount;
	}
	public static void main(String[] args) {
		Scanner sale =new Scanner(System.in);
		
		System.out.println("Please enter your name :");
		String name=sale.next();
		
		System.out.println("Your address :");
		String address=sale.next();
		
		System.out.println("Enter your Type 'L' or 'D': ");
		char type =sale.next().charAt(0);
		
		System.out.println("Enter your purchase amount in Rs : ");
		int amount=sale.nextInt();
		
			
		Discount NA =new Discount();
		double netAmount = NA.NetAmount(amount, type);		
		System.out.println(name + " from " +  address + " has purchased from us with an discount of " + NA.discountPercent+"%" + " with Netamount "+ netAmount+" in total." );	
	}	
}

		
