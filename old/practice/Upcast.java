package practice;

public class Upcast {
	static class A           { int x; }
	static class B extends A { int y; }
	void f (B p) {
		A q = p;
	}

	public static void main (String[] args){
		B r = new B();
	}
}

