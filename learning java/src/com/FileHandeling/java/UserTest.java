package com.FileHandeling.java;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your address");
		String address = sc.next();
		
		User s1 =new User(name,address);
//		System.out.println(s1.getName());
		
		File f= new File("/Users/sakar/desktop/stressfile.txt");
		char[]array=new char[100];

		try {
			boolean value=f.createNewFile();
				if(value) {
			System.out.println("this NEW file is created");
			}
			else{
			System.out.println("this file already exist");
			}
//				String data ="I am sakar";
				FileWriter fw =new FileWriter("/Users/sakar/desktop/stressfile.txt");
				fw.write(s1.getName());
				System.out.println("\n");
				fw.write(s1.getAddress());
				System.out.println("data written succesfully");
				
				fw.close();
				//file reader
				FileReader fr=new FileReader("/Users/sakar/Desktop/stressfile.txt");
				fr.read(array);
				System.out.println("data read");
				System.out.println(array);
				fr.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
