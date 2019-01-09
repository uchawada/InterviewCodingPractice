package chasePractice;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args){
		CoinChange c = new CoinChange();
		
		int coins[] = {7, 8, 1};
		int m = coins.length;
		int V = 10;
        System.out.println(c.coinChange(coins, m , V)); 

	}
	public int coinChange(int[] coins, int len, int value){
		
		int[] T = new int[value + 1];
		
		Arrays.fill(T, Integer.MAX_VALUE);
		
		T[0] = 0;
		
		for(int i = 1; i <= value; i++){
			
			for(int j = 0; j < len; j++){
				
				if(coins[j] <= i){
					
					int res = T[i - coins[j]];
					if(res != Integer.MAX_VALUE && res + 1 < T[i]){
						T[i] = res + 1;
					}
				}
				
			}
				
		}
		return T[value];
	}
	

}
