package com.fourthassighnment;

public class Statickeywords {

	static int x=20;
	static int y=10;
	static int sum=x+y;
	
	public static void main(String[]args) {
		Statickeywords Sw=new Statickeywords();//by making an object.
		System.out.println("this is called by calling static variable: "+(Sw.x+Sw.y));
		System.out.println("\n");
		System.out.println("this is called by without calling variable: "+sum);//without making an object.
		System.out.println("\n");
		test();
}
	public static void test() {// using static method.
		System.out.println("this is called by using static method: "+sum);
		}
}
