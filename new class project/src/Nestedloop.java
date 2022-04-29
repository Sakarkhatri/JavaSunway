
public class Nestedloop {
public static void main(String[] args) {
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=5;j++) {
			System.out.print(j+"*");
		}
		System.out.println(" A"+i);
	}
	System.out.println("\n");
	
	for(int i=0;i<=8;i++) {
		for(int j=0;j<=5;j++) {
			System.out.print("*  ");
		}
		System.out.println("");
	}
System.out.println("\n");
	
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(j+"* ");
		}
		System.out.println("");
	}
}
}
