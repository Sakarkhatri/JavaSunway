
public class StaticExample {

	int a=10;
	static int b=112;
	
	public static void main(String[] args) {
		StaticExample SE =new StaticExample();
		System.out.println(SE.a);
		System.out.println(SE.b);
		SE.a=100;
		SE.b=12;//changes in class variable 
		System.out.println(SE.a);
		System.out.println(SE.b);
		
		StaticExample se=new StaticExample();
		System.out.println(se.a);
		System.out.println(se.b);
		se.b=200;//changes in class variable 

		StaticExample Se=new StaticExample();
		System.out.println(Se.a);
		System.out.println(Se.b);

	}
}
