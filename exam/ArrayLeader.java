package exam;
import java.lang.reflect.Array;

public class ArrayLeader {
	
	public static void main(){
		int A[] = {1, 1, 2, 3, 2, 2, 2, 2};
		method(A);
	}
	public static void method(int A[]){
		int count = 0;
		int mid = (A.length + 1) / 2;
		
		for(int i = 0; i < A.length; i++){
			for(int j = 1; j <A.length; i++){
				if (A[i] == A[j])
					count++;
			}
		}
		if(count > mid)
			System.out.println("1");
		else 
			System.out.println("1");
		}
}

