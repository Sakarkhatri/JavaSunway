package com.FileHandeling.java;
import java.io.*;

public class FileHandeling {
public static void main(String[]args) {
	File f= new File("Users/sakar/Desktop/goodfile.txt");
	char[]array=new char[100];
	
	try {
		boolean value=f.createNewFile();
			if(value) {
		System.out.println("this NEW file is crreated");
		}
		else{
		System.out.println("this file already exist");
		}
			//File writing
			String data ="I am sakar";
			FileWriter fw =new FileWriter("newfile.txt");
			System.out.println("data written succesfully");
			fw.close();
			
			//file reader
			FileReader fr=new FileReader("Users/sakar/Desktop/goodfile.txt");
			fr.read(array);
			System.out.println("data read");
			System.out.println(array);
			fr.close();
			
//			//file delete
//			boolean result=f.delete();
//			if(result) {
//				System.out.println("file deleated");
//			}
//			else {
//				System.out.println("file not deleted");
//			}
			}
	catch(Exception e) {
		e.getStackTrace();
	}
	}
}