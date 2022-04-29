package com.assighnment;
//import java.util.Scanner;
public class Primeanswer {
			
		public static boolean checkPrime(int num){
		    // 0, 1 and negative numbers are not prime
		    if(num<2 || num==4){
		        return false;
		    }
		    else{   
		 
		        //int x= num/2;
		        for(int i=2;i<num/2;i++){
		            if(num%i==0){
		    			
		                return false;
		            }
		        }
		    }	    			

		    return true;
		
		}
//		public static int Primecount(int x, int y) {
//			int count =0;
//			int pCount=0;
//			for (int i=1; i<=100 ; i++) {
//				boolean a = checkPrime(i);
//				if(a==true) {
//					System.out.println(i);
//					pCount++;
//			}
//		}
//		return pCount;
		
//		}
		
		
			public static void main(String[] args) {
				System.out.println("All Prime Numbers Between 1 to 100");
			    System.out.println("\n");

				for(int i=1;i<=100;i++){

				    if(checkPrime(i)){
				        System.out.println(i);
				    }
				}

//			System.out.print("The total prime number are . "+ Primecount(1,100));
			}
			
		}


