import java.util.Scanner;
public class RateOfInterest {
	
	
	
//public static double Rate(double time,int amount) {
//	if(time<=1) {
//		return (time*amount*.15);
//		}
//	else {
//		return (time*amount*.15)+
//	}
	public static void main(String[]args) {
		int amount;
		int time;//in months
		double interest = 0;
	
		Scanner B =new Scanner(System.in);
		System.out.print("Enter the amount yo wanna deposit. ");
		amount = B.nextInt();
		
		System.out.print("Enter the time peroid in months. ");
		time = B.nextInt();
		if(time>=12) {
			interest= (amount*.15);
			}		
//		else {
//			interest= (time*amount)*.15;
//		}
		System.out.println("You receive a total interest of :"+ interest +" in "+time+"months of time peroid.");
		System.out.println("Your total balance is "+ (interest+(time*amount)));

}
}
