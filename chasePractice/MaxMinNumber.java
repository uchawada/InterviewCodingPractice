package chasePractice;

import java.util.Arrays;

public class MaxMinNumber {

	public static void main(String[] args){
		maxMinNumber(new int[]{-20, 34, 21, -87, 92, Integer.MAX_VALUE}); 
		maxMinNumber(new int[]{10, Integer.MIN_VALUE, -2}); 
		maxMinNumber(new int[]{Integer.MAX_VALUE, 40, Integer.MAX_VALUE}); 
		maxMinNumber(new int[]{1, -1, 0});

	}
	
	public static void maxMinNumber(int[] A){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int number : A){
			if(number > max){
				max = number;
			}
			else if (number < min){
				min = number;
			}
			
		}
		System.out.println("Given integer array : " + Arrays.toString(A)); 
		System.out.println("Largest number in array is : " + max); 
		System.out.println("Smallest number in array is : " + min);

	}
}
