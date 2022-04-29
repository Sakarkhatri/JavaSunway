import java.util.Scanner;
public class userseswhile {
	public static void main(String[] args) {
		int sum =0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		while(num>=0) {
			//this for sum only
			sum=num+sum;

			System.out.println("Enter the number");
			num=scan.nextInt();
		
		}
		System.out.println("You entered the wrong number");
		System.out.println("The sum is :" + sum);

}
}

