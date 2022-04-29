package com.application;

import java.util.Scanner;

public class MainMenu {
public static void main(String[] args) {
	MainMenu Mm= new MainMenu();
	Mm.menuOption();
	
}
public void menuOption() {
	Scanner S = new Scanner(System.in);
	int menuNumberEntered=0;
	try {
		do {
			System.out.println();
			System.out.println("Select a menu (enter number 1 to 7)");
			System.out.println("1. Add new student");
			System.out.println("2. Display Student data");	
			System.out.println("3. Remove Student Data");
			System.out.println("4. Add Student Marks");
			System.out.println("5. Display Student Marks");
			System.out.println("6. Display Student Result");
			System.out.println("7. Save and Exit");
			System.out.println("Please enter nnumber between 1 to 7: ");
			
			System.out.println("Please enter nnumber between 1 to 7: ");
			menuNumberEntered = S.nextInt();
			while(menuNumberEntered<1 || menuNumberEntered>7) {
				System.err.println("ERROR!!  Enter nnumber between 1 to 7:");
				menuOption();
				}
			System.out.println("Thankyou you entered: "+menuNumberEntered);
			switch (menuNumberEntered) {
			case 1:
				addNewStudent();
				break;
			case 2:
				displayStudentData();
				break;
			case 3:
				removeStudentData();
				break;
			case 4:
				addStudentMark();
				break;
			case 5:
				 displayStudentMark();
				break;
			case 6:
				displayStudentResult();
				break;
			case 7:
				saveAndExit();
				break;
			}
			
			}while(menuNumberEntered!=7);
		
		}catch(java.util.InputMismatchException ex) {
			System.err.println("ERROR!! Number hal khurukka");
			menuOption();
}
}
public void addNewStudent(){
	
}
public void displayStudentData(){
	
}
public void removeStudentData(){
	
}
public void addStudentMark(){
	
}
public void displayStudentMark(){
	
}
public void displayStudentResult(){
	
}
public void saveAndExit(){
	
}
}