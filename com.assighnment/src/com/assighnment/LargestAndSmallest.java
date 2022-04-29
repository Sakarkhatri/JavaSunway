package com.assighnment;
import java.util.Scanner;
public class LargestAndSmallest {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	 
	        int number;
	        int largest = Integer.MIN_VALUE;  
	        int smallest = Integer.MAX_VALUE;  
	        char choice;
	 
	        do
	        {
	            System.out.print("Enter the number ");
	            number = scan.nextInt();
	            if(number==0) {
	            	break;
	            }
	 
	            if(number > largest)
	            {
	            	largest = number;
	            }
	 
	            if(number < smallest)
	            {
	            	smallest = number;
	            }
//	            System.out.print("Do you want to continue y/n? ");
//	            choice = console.next().charAt(0);
//	        }while(choice=='y' || choice == 'Y');
	    }while(number!=0);
	 
	        System.out.println("Largest number: " + largest);
	        System.out.println("Smallest number: " + smallest);
	    }  
	}