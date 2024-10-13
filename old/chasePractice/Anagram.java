package chasePractice;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args){
		
		Anagram a = new Anagram();
		System.out.println(a.anagram("triangle", "integral"));
		System.out.println(a.anagram2("what", "integral"));		
	}
	
	public boolean anagram(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 != len2){
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < len1; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	
	public boolean anagram2(String s1, String s2){
		
		final int NO_OF_CHARS = 256; 
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 != len2){
			return false;
		}
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);
		int i; 
		
		for(i = 0; i < len1; i++){
			
			count1[arr1[i]]++;
			count2[arr2[i]]++;
		}
		int a; 
		for(a = 0; i < NO_OF_CHARS; i++){
			if(count1[i] != count2[i])
				return false;
		}
		return true;
		
	}

}













