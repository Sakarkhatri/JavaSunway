package com.sunway.java;


public class Ascendingorder {
	


public static void main(String[]args) {
	int x= 15;
	int y=20;
	int z=10;
	
	if (x<y && x<z && y<z) {
		System.out.println("Ascending order is : " +x + "x,"+y + "y," +z +"z.");
	}
	
	else if (y<x && y<z && x<z) {
		System.out.println("Ascending order is : " +y + "y," +x + "x," +z + "z.");
	}
	else if (x<y && x<z && z<y) {
		System.out.println("Ascending order is : " +x + "x,"+ z + "z," +y + "y.");

	}
	else if (y<x && y<z && z<x) {
		System.out.println("Ascending order is : " +y + "y,"+ z + "z," +x + "x.");

	}
	else if (z<x && z<y && x<y) {
		System.out.println("Ascending order is : " +z + "z,"+ x + "x," +y + "y.");

	}

	else  { 
		System.out.println("Ascending order is : " +z + "z,"+ y + "y," +x + "x.");
		}
}
}

//xyz
//xzy
//yxz
//yzx
//zxy
//zyx
