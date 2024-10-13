package practice;

public class Subtyping {
	public static void main(String[] args){
		
		S o = new S ();
		o.f(5);
	}
}
class S {
	public int f(int x){
		System.out.println("Function f");
		return 0;
	}
	public int g(String[] arr){
		System.out.println("Function g");
		return 0;
	}
	public void h(int x, int y){
		System.out.println("Function h");
	}
	
	
}