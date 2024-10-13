package tutorials;

public class StringSplosion {
	public static void main(String[] args){
		String str = "Code";
		String str2 = "abc";
		String str3 = "ab";
		StringSplosion a = new StringSplosion();
	
		method(str);
	}
	public static void method(String str){
		String result = "";
		for(int i =0; i <= str.length(); i++){
			result += str.substring(0, i);
		}
		System.out.println(result);
	}
}
