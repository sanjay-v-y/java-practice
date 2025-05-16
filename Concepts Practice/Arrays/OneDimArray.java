package org.netflix.dev.array;

public class OneDimArray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		int val=7;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = val;
			
			val+=10;
			
		}
		
		for (int i : arr) {
			
			System.out.print(i + " ");
			
		}
	}
}
