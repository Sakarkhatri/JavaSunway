import java.util.Scanner;
public class Bankaccountnew {
	int bankAccount;
	int ammount;
	String Name;
	String accountType;
	int withdrawlAmount;
	
	Bankaccountnew(String Name,int bankAccount,int ammount, String accountType){
		this. Name= Name;
		this.bankAccount=bankAccount;
		this.ammount=ammount;
		this.accountType=accountType;
		}

	Bankaccountnew(int withdrawlAmount,int ammount){
		this. withdrawlAmount= withdrawlAmount;
		this.ammount=ammount;
		}
	Bankaccountnew(String Name,int ammount){
		this.Name=  Name;
		this.ammount=ammount;
		System.out.println("Account holder Mr."+"sakar"+ " has an total balance of "+ammount);

		}
	public void detail() {
		System.out.println("Name:"+Name+ "\nbankAccount:" +bankAccount+  "\naccountType:" +accountType+ "\nammount:" +ammount);
	}
	
	public static void main(String[] args) {  
		//object creation  
		Bankaccountnew s = new Bankaccountnew ("John",980313036,9090909,"Saving");
		s.detail();
		//System.out.println("Name:"+Name+ "\nbankAccount:" +bankAccount+  "\naccountType:" +accountType+ "\nammount:" +ammount)

		
}
	}

