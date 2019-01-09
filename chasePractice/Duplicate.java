package chasePractice;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args){
		Duplicate d = new Duplicate();
		int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 6};
		d.duplicate(arr);
	}
	
	public void duplicate(int[] arr){
		int len = arr.length;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i = 0; i < len - 1; i++){
			if(arr[i] == arr[i+1]){
				B.add(arr[i]);
			}
			else {
				A.add(arr[i]);
			}
		}
		A.add(arr[len-1]);
		
		int Alen = A.size();
		int[] arrNew = new int[Alen];
		
		for(int i = 0; i < Alen; i++){
			arrNew[i] = A.get(i);
			System.out.print(arrNew[i] + " ");
		}
	}
}
