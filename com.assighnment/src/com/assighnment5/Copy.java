package com.assighnment5;

public class Copy {
		public static void main(String[] args) {
			int[] arr= {0,10,20,30,40};
			int[] cArr=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				cArr[i]=arr[i];
			}
				System.out.println("original array:");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");

			}
				System.out.println();
				System.out.println("Copied array:");
				for(int i=0;i<cArr.length;i++) {
				System.out.print(cArr[i]+" ");
			}
		}
}
