import java.util.Scanner;
public class usserinputmultiplation {

	public static void main(String[] args) {
		Scanner mul =new Scanner(System.in);
		System.out.println("Enter the number");
		int number =mul.nextInt();
		
		for (int i=1; i<=10;i++) {
			System.out.println(number +"*"+i+"=" + (number * i));

		}
		int f=1;
		
		for (int i=1; i<=number;i++) {
			f=f*i;
						
		}
		System.out.println("\n");

		System.out.println("Factorial is :" + f);

}
}
