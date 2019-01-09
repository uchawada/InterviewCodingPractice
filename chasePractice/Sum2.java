package chasePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

//finds two least number in array that add up to x. 
			
public class Sum2 {
		
	public static void main(String[] args){
		int[] A = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("Array...");
		int[] randoms = getRandomArray(10);
		//printArray(A);
		method(A, 4);
		
	}	
	
	public static void method(int[] Array, int sum){
		
		Set set = new HashSet(Array.length);
		
		for(int number: Array){
			int target = sum - number;
			
			if(!set.contains(target)){
				set.add(number);
			}else 
			{
				System.out.printf("(%d, %d) %n", number, target);
			}			
		}
		
	}
	public static int[] getRandomArray(int length){
		int[] randoms = new int[length];
		for(int i = 0; i < length; i++){
			randoms[i] = (int) (Math.random() * 10);
		}
		return randoms;
	}
	
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}













