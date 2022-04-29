package com.assighnment;
public class Primeno {
		
	public static boolean checkPrime(int num){
	    // 0, 1 and negative numbers are not prime
	    if(num<2 || num==4){
	        return false;
	    }
	    else{   
	 	        for(int i=2;i<num/2;i++){
	            if(num%i==0){
	    			
	                return false;
	            }
	        }
	    }	    			
	    return true;
	}
		public static void main(String[] args) {
			System.out.println("All Prime Numbers Between 1 to 100");
		    System.out.println("\n");

			for(int i=1;i<=100;i++){

			    if(checkPrime(i)){
			        System.out.print(i+" ");
			    }
			}
		}		
	}



