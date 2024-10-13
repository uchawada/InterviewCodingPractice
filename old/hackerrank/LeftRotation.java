package hackerrank;

public class LeftRotation {
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		
		System.out.println(leftRotate(a, 4));
		
		for(int i = 0; i < a.length; i++ ){
			System.out.println(a[i]);
			
		}
	}

	public static int[] leftRotate(int[] a, int d){
		
		for(int i = 0; i < d; i++){
			leftRotation(a);
		}
		return a;
	}
	public static int[] leftRotation(int a[]){
		int len = a.length;
		
		int temp = a[0]; 
		
		for(int i = 0; i < len - 1; i++){
			a[i] = a[i+1];
		}
		a[len-1] = temp;
		
		a[len-1] = temp; 
		return a;
		
	}
}
