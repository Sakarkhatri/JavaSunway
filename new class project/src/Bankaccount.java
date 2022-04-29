import java.util.Scanner;


public class Bankaccount{
String name;
long accountNumber;
String typeOfAccount;
double balance;

Bankaccount (String name, long accountNumber, String typeOfAccount, double balance){
	this.name = name;
	this.accountNumber = accountNumber;
	this. typeOfAccount = typeOfAccount;
	this.balance = balance;
}
public void displayDetails() {
	System.out.println( "Name:");
	System.out.println(this.name);
	System.out.println ("Balance:");
	System. out.println (this.balance) ;
}
public void depositAmount (double depositAmount){
	double newBalance = this.balance + depositAmount;
	this.balance = newBalance;
}

public void withdrawAmount (double withdrawAmount){
	if (withdrawAmount <= this.balance){
			double newBalance = this.balance- withdrawAmount;
					this.balance = newBalance;
	}
	else{
		System.out.println ("Insufficient balance.");
	}
}
public static void main (String[] args){
Bankaccount S= new Bankaccount ("SAKAR", 1000009182, "Saving", 5000000);
S.displayDetails();
System.out.println();
S.withdrawAmount (90000) ;
S.displayDetails();
System.out.println();
S.depositAmount (500000) ;
	S.displayDetails();
	System.out.println();
	S.withdrawAmount (80000) ;
	S.displayDetails();
}
}
