package tutorials;

public class WithoutString {

	public static void main(String[] args){
		System.out.println(withoutString("THIS is a FISH", "IS"));
	}
	public static String withoutString(String base, String remove){
		if(base.contains(remove)){
			base = base.replace(remove, "");
		}
		
		base = base.replace(remove.toLowerCase(), "");
		base = base.replace(remove.toUpperCase(), "");
		return base.replace(remove, "");
	}
}
