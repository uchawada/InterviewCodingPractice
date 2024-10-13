package practice;

public class Inheritance {
	  public static void main (String[] args) { 
		  new J ().f(3); 
		  }
	}
class I {
	  int f (int x) {
	    System.out.format ("A.f (%d)%n", x);
	    return (x == 0) ? g () : f (x - 1); 
	  }
	  int g () { System.out.println ("A.g ()"); return 0; }
	}

	class J extends I {
	  int g () { System.out.println ("B.g ()"); return 0; }
	}