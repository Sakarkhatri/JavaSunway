       
public class Staticvariable {

	int x=2;
	static int y=4;
	public static void main(String[]args) {
		Staticvariable Sv=new Staticvariable();
		Sv.myMethod();
		System.out.println(Sv.x+Sv.y);
		System.out.println(Staticvariable.y);
		test();
		Staticvariable.test();
		Sv.test();
		
		}
	public void myMethod() {
		System.out.println(x);
		test();
		
	}
	public static void test() {
		System.out.println("hello");
}
}
