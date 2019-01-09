package hackerrank;

public class Hourglass {
	
	public static void main(String[] args){
		int arr[][] = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, 
						{1,1,1,0,0,0}, {0,0,2,4,4,0}, 
						{0,0,0,2,0,0}, {0,0,1,2,4,0}
					};
		
		hourglass(arr);
	}
	
	public static void hourglass(int arr[][]){
		int sum = 0;
		
		int sumFirst = 0; 
		int sumLast = 0; 
		int finalSum = 0; 
		int len = arr.length;
		for(int i = 0; i < arr.length - 2; i++){
			for(int j = 0; j < arr[0].length - 2; j++){
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
											arr[i+1][j+1] + 
								arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
					
			}	
			if(finalSum < sum){
				finalSum = sum;
			}
		}
		sumFirst = arr[len-3][len-4] + arr[len-3][len-3] + arr[len-3][len-2] + 
					arr[len-2][len-3] + 
			arr[len-1][len-4] + arr[len-1][len-3] + arr[len-1][len-2]; 
		
		
		sumLast = arr[len-3][len-3] + arr[len-3][len-2] + arr[len-3][len-1] + 
				arr[len-2][len-2] + 
		arr[len-1][len-3] + arr[len-1][len-2] + arr[len-1][len-1]; 
		
		if(finalSum < sumFirst) {
			finalSum = sumFirst;
		}
		if(finalSum < sumLast){
			finalSum = sumLast; 
		}
		
		System.out.println(finalSum);

	}


}
