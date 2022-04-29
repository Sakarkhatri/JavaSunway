import java.util.Scanner;
public class Primeno {
	
		public static void main(String[]args) {
			int count = 0;
			Scanner PN = new Scanner(System.in);
			System.out.print("Please enter a number");
			int n = PN.nextInt();
			
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					count ++;
					break;
		}
	}
			if (count ==0) {
				System.out.print("It is a prime number. ");

			}
			else {
				System.out.print("It is not a prime number. ");

			}
		}
}
