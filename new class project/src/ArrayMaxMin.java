
public class ArrayMaxMin {

//	static int arr[]= {21,22,32,90,3,7};
//	
//	static int largest() {
//		int max= arr[0];  // Initialize maximum element
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>max){
//			max=arr[i];
//		}
//		return	max;
//		
//		
//		}
	public static void main(String[] args){
		int arr[]= {1,3,6,9,8,7,5,6,4,2};
		int max= arr[0];  // Initialize maximum element
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
			max=arr[i];
		}
		}
	
	   int min= arr[0];  // Initialize maximum element
	   for(int i=0; i<arr.length;i++) {
		  if(arr[i]<min) {
		   min=arr[i];
	   }
	   }
	   
	   int sum=0;
	   for(int i=0; i<arr.length;i++) {
		   sum=sum+arr[i];
	   }
	   int multyply=1;
	   for(int i=0; i<arr.length;i++) {
		   multyply=multyply*arr[i];
	   }
	   
	   
			   
        System.out.println("Maximun in given array is " + max); 
        System.out.println("Maximun in given array is " + min); 
        System.out.println("sum in given array is " + sum); 
        System.out.println("Average in given array is " + sum/arr.length); 
        System.out.println("multyply in given array is " + multyply); 


        }
	}

		
