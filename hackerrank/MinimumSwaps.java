package hackerrank;

public class MinimumSwaps {

	public static void main(String[] args) {
          		int[] arr2 = {4,3,1,2};
		System.out.println(minimumSwaps(arr2));
	}
	
	public static int minimumSwaps(int[] arr){
		
		int len = arr.length;
		int swaps = 0; 
		for(int i = 1; i < len; i++){
			for(int j = 0; j < len-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swaps ++;
				}
			}
		}
		return swaps;
	}

}
