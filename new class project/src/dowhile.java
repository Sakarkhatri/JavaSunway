import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner mul =new Scanner(System.in);
		
		int num;
		
		//this prints any first entered number
		do {
			
			System.out.println("Enter the number");
		    num =mul.nextInt();
			
		}
		while(num> 1 && num <10); 
		System.out.print(false);
		}
}

