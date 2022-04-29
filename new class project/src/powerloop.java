import java.util.Scanner;

public class powerloop {
	
	//this is method 
public static int power(int base, int power) {
	int answer =1;
	for (int i=1; i<=power ; i++) {
		answer = answer *base;
	}
	return answer;
		
	}

	public static void main(String[] args) {
		
		Scanner mul =new Scanner(System.in);
		System.out.println("Enter the first number");
		int base =mul.nextInt();
		
		System.out.println("Enter the second number");
		int power =mul.nextInt();
		
		int result=1;
		
		for (int i=1; i<=power ; i++) {
			result = result*base;
		System.out.println("your answer is :" +  result );
}
		System.out.println("\n");

		System.out.println("next way of answer according to the method used above");
	
		System.out.println("your answer is :" +power(base,power));
		}
}


