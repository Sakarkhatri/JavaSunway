import java.util.Scanner;

public class findoutPrimeno {
	
	public static boolean isprime(int a) {
		if(a<1) {
			return false;
		}
		for (int i=2; i<a ; i++) {
			if(a%i==0) {
				return false
;			}
		}
		return true;
	}

	public static int Primecount(int first, int second) {
		int count =0;
		int pCount=0;
		for (int i=first; i<=second ; i++) {
			boolean a = isprime(i);
			if(a==true) {
				System.out.println(i);
				pCount++;
		}
	}
	return pCount;
}
	
public static void main(String[]args) {
	Scanner PN = new Scanner(System.in);
	System.out.print("Please enter the first number :");
	int n1 = PN.nextInt();

	System.out.print("Please enter the second number :");
	int n2 = PN.nextInt();
	
	if (n1>n2) {
		System.out.print("Error");

	}
	int a =Primecount(n1,n2);
		System.out.print("The total prime number are . "+ a);
		}
}


		

