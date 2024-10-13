package practice2;

public class Downcast {
	  static class A     
	  { 
		  int x; 
	  }
	  static class B extends A 
	  { 
		  int y; 
	  }

	  static A convert (B p) {
	    A result = (A) p;
	    return result;
	  }

	  public static void main (String[] args) {
	    A r = new A ();
	    r.x = 5;
	    B b = new B();
	    b.y = 10;
	    A s = convert (b);	    
	    System.out.println (s);
	  }
	}