package chasePractice;

public class Isodd {
	
	public static void main(String[] args){
		int number = 168;
		int count = 0;
		
		System.out.println(reverse(number));
		 while(isOdd(number) == true){
		      number = number + Integer.parseInt(reverse(number));
		      count = count + 1;
		    }
		    
		    System.out.println(count + " " + number);
	}
	
	 public static boolean isOdd(int num){
		    String number = toString(num);
		    char[] nums = number.toCharArray();
		  
		    for(int i = 0; i < nums.length; i++){
		      if(isOddDigit(nums[i])){
		          return true; 
		      }
		    }
		    return false;
	 }
		  
		  public static boolean isOddDigit(int num){
		    if(num % 2 == 1){
		      return true; 
		    }
		    return false;
	 }
		  
		  public static String reverse(int num){
		    String number = toString(num);
		    char[] nums = number.toCharArray();
		    
		    
		    String buffer = "";
		    int i = 0;
		    for(i = nums.length -1; i >= 0; i--){
		      buffer += nums[i];
		    }
		    return buffer;
		  }
		  
		  public static String toString(int num){
		    String number; 
		    number = Integer.toString(num);
		    return number;
		  }
}
