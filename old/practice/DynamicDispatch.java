package practice;

public class DynamicDispatch {
	public static void main(String[] args){
		A x = new D();
		x.foo();
	}
}
class A {
	void foo(){
		System.out.println("A");
	}
}
class B extends A {
	void foo(){
		System.out.println("B");
	}
}
class D extends A {
	
	void foo(){
		System.out.println("D");
	}
}

