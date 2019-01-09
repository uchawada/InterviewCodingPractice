package practice;

public class InheritanceAbstract {
	  public static void main (String[] args) { new Ba ().f (3); }
}
abstract class Aa{
	  int f (int x) {
	    System.out.format ("A.f (%d)%n", x);
	    return (x == 0) ? g () : f (x - 1); 
	  }
	  abstract int g ();
	}

	class Ba extends Aa {
	  int g () { System.out.println ("B.g ()"); return 0; }
	}
