package com.fourthassighnment;

public class FindCharacter {
	 public static void main(String []args) {
		 String str = "Umbrella";
	        char ToCheck = 'e';
	        int i = 0;
	        boolean found = false;
	        String newString = "";
	        while(!newString.equals(str)) {
	            char ch = str.charAt(i);
	            if(ch == ToCheck) {
	                found = true;
	                break;
	            }
	            newString += ch;
	            i++;
	        }
	        if(found) {
	            System.out.println("Character '"+ToCheck+"' exists in the string");
	        } else {
	            System.out.println("Character '"+ToCheck+"' does not exist in the string");
	        }
	 }
	}

