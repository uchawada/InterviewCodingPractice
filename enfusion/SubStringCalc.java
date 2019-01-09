package enfusion;

public class SubStringCalc {
	
	public static void main(String[] args){
		System.out.println(substring("abcde"));
	}
	public static long substring(String s){
		long count = 0; 
		char[] S = s.toCharArray();
		int len = S.length;
		
		for(int i = 0; i <= len -1; i++){
			for(int j = 0; j < len - i; j++){
				
				System.out.println();
			}
			System.out.println();
			
		}
		
//		for(int i = 1; i <= len; i++){
//			for(int j = 0; j <= len - i; j++){
//				
//				int a = j + i - 1;
//				
//				for(int k = j; k <= a; k++){
//					System.out.print(S[k]);
//					count++;
//				}
//				System.out.println();
//			}
//		}
		return count;
		
		
	}

}
