package com.sunway.java;

public class DecisionConstract {
	
	public void test() {
		int x = 3;
		if(x>2) {
			System.out.println("Its True");
	}
		else {
			System.out.println("Its faulse");
			
		}
	}
	// seperate one
	public void Test(int n) {
		if (n%2 == 0) {
			System.out.println(n + " is an even number");
		}
		else { 
			System.out.println(n + " is an odd number");

		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionConstract dc =new DecisionConstract();
		dc.test();
		dc.Test(3);
		
	}

}
