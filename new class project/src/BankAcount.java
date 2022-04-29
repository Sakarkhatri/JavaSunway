
public class BankAcount {
	
private int acc_number;
private String name;
private String account_type;
private double balance;


public BankAcount(String name,int acc_number,String account_type,double balance) {
	this.name=name;
	this.acc_number=acc_number;
	this.account_type=account_type;
	this.balance = balance;
}

public String getname() {
	return name;
}
public String getaccount_type() {
	return account_type;
}
public int getacc_number() {
	return acc_number;
}
public double getbalance() {
	return balance;
}
public void setname(String name) {
	this.name=name;
}
}
