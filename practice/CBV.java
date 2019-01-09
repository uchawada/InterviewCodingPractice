package practice;

public class CBV {
	void f(){
		int x = 10;
		g(x);
		System.out.println(x);
	}
	
	void g(int y){
		y = y+1;
	}
	public static void main(String[] args){
		CBV c = new CBV();
		c.f();
	}
}
