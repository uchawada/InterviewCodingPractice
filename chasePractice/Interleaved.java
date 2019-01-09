package chasePractice;

public class Interleaved {

	public static void main(String[] args){
		Interleaved i = new Interleaved();
		System.out.println(i.interleaved("XXX", "XXZ", "XXZXXXX"));
	}
	
	public boolean interleaved(String s1, String s2, String s3){
		
		if(s3.contains(s1) && s3.contains(s2))
			return true;
		return false;
	}
}
