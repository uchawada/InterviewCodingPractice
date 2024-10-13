package hackerrank;

public class CountSwaps {
	
	public static void main(String[] args){
		int[] a = {6,4,1};
		countSwaps(a);
	}
	
	public static void countSwaps(int[] a){
		int n = a.length;
		int swaps = 0; 
		for (int i = 1; i < n; i++) {
		    
            for (int j = 0; j < n - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                	swaps++;
                	int temp = a[j+1];
                	a[j+1] = a[j]; 
                	a[j] = temp;
                   // swap(a[j], a[j + 1]);
                    
                }
            }   
        }
		
		
		System.out.println("Array is sorted in " + swaps + " swaps. ");
		System.out.println("First Element " + a[0]);
		System.out.println("Second Element " + a[n-1]);
	}

}
