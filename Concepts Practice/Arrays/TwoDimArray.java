package org.netflix.dev.array;

public class TwoDimArray {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		arr[0][0] = 9;
		arr[0][1] = 8;
		arr[0][2] = 7;
		
		arr[1][0] = 2;
		arr[1][1] = 1;
		arr[1][2] = 6;
		
		arr[2][0] = 3;
		arr[2][1] = 4;
		arr[2][2] = 5;
		
		for (int[] row : arr) {
			
			for (int val : row) {
				
				System.out.print(val + "  ");
			}
			System.out.println();
		}	
	}
	
}
