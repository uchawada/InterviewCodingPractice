package hackerrank;

public class NewYearChaos {
	
	 public static void main(String[] args) {
		 int[] q = {2,1,5,3,4};
		 int[] t = {2,5,1,3,4};
		 minimumBribes(q);
		 minimumBribes(t);
	   }
	
	
	static void minimumBribes(int[] q) {
		int len = q.length;
		int swaps = 0; 
		String chaotic = "";
        for(int i = len - 1; i >= 0; i--){
        	if(q[i] - 1 -i > 2){
        		System.out.println("Too chaotic");
        		return;
        	}
        }
       
		for (int i = 0; i < len - 1; i++) {
		    
            for (int j = 0; j < len - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
                if (q[i] > q[i + 1]) {
                	swaps++;
                	int temp = q[i+1];
                	q[i+1] = q[i]; 
                	q[i] = temp;                    
                }
            }   
        }
			System.out.println(swaps);
			return;
    }

   

   
}
