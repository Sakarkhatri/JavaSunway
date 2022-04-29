
public class Changingvariable {
public static void main(String[] args) {
	

	int x=20;
	int y=10;
System.out.println("x is "+x);
System.out.println("y is "+y);

int temp=x;
x=y;
y=temp;
System.out.println("x is "+x);
System.out.println("y is "+y);
}
}
