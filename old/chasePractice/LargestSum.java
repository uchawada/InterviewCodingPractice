package chasePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestSum {

	public static void main(String[] args) {
		LargestSum l = new LargestSum();
		System.out.println(l.largestSum(new int[] {10, 5, 7, 3, 40, 50}));
		
	}
	
	public int largestSum(int[] arr){
		int sum = 0;
		
		ArrayList A = new ArrayList();
		int num1 = findMax(arr);
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != num1){
				A.add(arr[i]);
			}
		}
		return sum;
	}
	
	public int findMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int number: arr){
			if (number > max) 
				max = number;
		}
		return max; 
	}

}
