import java.util.Scanner;

public class averagesum {

	public static void main(String[]args) {
		
		int sum=0;
		int count=0;

		float average;
		
		for(int i = 1; i<=7; i++) {

		Scanner num =new Scanner(System.in);
		System.out.println("Enter the number");
		int x = num.nextInt();
		
		sum=sum+x;
		count++;
		
		}
		System.out.println(sum);
		
		average = sum/7;
		System.out.println(average);

		
	}
	
}
