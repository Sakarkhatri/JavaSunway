package com.assighnment5;
public class CircularlyRight {
	 public static void main(String[] args) {    
	        int [] arr = new int [] {1, 2, 3, 4, 5};     
	        //n determine the number of times an array should be rotated.    
	        int n = 1;    
	           
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }      
	            
	          
	        for(int i = 0; i < n; i++){    //Rotate the given array by n times toward right  
	            int j, last;    
	            //Stores the last element    
	            last = arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element  will be added to first index    
	           arr[0] = last;    
	        }    
	        System.out.println();    
	        //Displays resulting array after rotation    
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}    