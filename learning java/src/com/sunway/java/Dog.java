package com.sunway.java;

public class Dog {
	int a =20;
	
	public int sum(int x, int y) {
		int z = x+y;
		return z;
		
				
	}
	public void add(int x, int y) {
		int z =x+y;
		System.out.println(z);
		
	}
	public static void  main(String [] args) {
		Dog d = new Dog();
				d.sum(21, 22);
				d.add(20, 990);
				//to show the value of return
				System.out.println(d.sum(21,22));
				
				int result = d.sum(21,22) - 50;
						System.out.println(result);
						
				//int result2 = result + a;
						//System.out.println(result2);
						
	}
}
