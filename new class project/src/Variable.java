
public class Variable {
	//instance variable
int x=20;
int y=90;

//Variable(int x,int y){ this is constructor
//this.x=x;
//this.y=y;
//}

public void sum() {
	
	System.out.println(x+y);
}
public void multiply() {
	//local variable
	int x=100;
	int y=2;
	System.out.println(x*y);
	}

public static void main(String[]args) {
//	Variable S =new Variable(10,20);this is for constructor
	Variable S =new Variable();
	S.sum();
	S.multiply();
	
}

}

