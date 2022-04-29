import java.util.Scanner;

public class Reveraearay {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.print("Enter the number: ");
	int A = s.nextInt();
	int arr[] = new int[A];
    int rev[] = new int[A];
    
    System.out.println("Enter "+A+" elements ");
    for( int i=0; i < A; i++){
        arr[i] = s.nextInt();
    }
    for( int i=0; i < A; i++){
        System.out.print(arr[i]+", ");
    }
    System.out.println(" ");

    System.out.println("Reverse of an array is :");
    int j=0;
    for( int i=rev.length-1; i>=0 ; i--){
        rev[i] = arr[j];
        j++;
    }
    for( int i=0; i<rev.length; i++){
        System.out.print(rev[i]+", ");
    }
}
}
