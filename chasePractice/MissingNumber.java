package chasePractice;

public class MissingNumber {
	
	public static void main(String[] args){
		int[] Array = {0,1,2,3,4,5,6,7,8,10};
		MissingNumber m = new MissingNumber();
		m.missingNumber(Array);
	}
	
	public void missingNumber(int[] Array){
		
		int len = Array.length;
		int sum = 0;
		int sum2 = 0;
		int[] A = new int[11];
		for(int i = 0; i < 11; i++){
			A[i] = i;
			sum += A[i];
		}
		for(int i = 0; i < Array.length; i++){
			sum2 += Array[i];
		}

		System.out.println(sum);
		System.out.println(sum2);
		int answer = sum - sum2; 
		System.out.println("MissingNumber is " + answer);
	}
}
