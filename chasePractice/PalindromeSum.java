package chasePractice;

public class PalindromeSum {

	/* Choose a number, reverse its digits and add it to its original number. If the sum is not a palindrome, 
	 * (it is not the same number from left to right and right to left), repeat this procedure. 
	 * 
	 * Example - Number = 195 
	 * 
	 * 195 + 591 (reverse number) = 786
	 * 786 + 687 = 1473 
	 * 1473 + 3741 = 5214
	 * 5214 + 4125 = 9339 (palindrome)
	 */
	
	public static void main(String[] args){
		int num = 100; 
		
		while(!isPalindrome(num)){
			num = num + Integer.parseInt(reverse(toString(num)));
			isPalindrome(num);
		}
		System.out.println(num);
		
	}
	
	public static String reverse(String num){
	
		char numbers[] = num.toCharArray();
		String buffer = "";
		for(int i = numbers.length - 1; i >= 0; i--){
			buffer += numbers[i];
		}
		return buffer;
		
	}
	
	public static boolean isPalindrome(int num){
		String number = toString(num);
		String reverse = reverse(number);
		
		if(number.equals(reverse))
				return true;
		else	return false;
		
	}
	
	public static String toString(int num){
		return Integer.toString(num);
		
	}
	
}
